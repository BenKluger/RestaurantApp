public class BillPrintedState implements State{
    private static BillPrintedState uniqueInstance = new BillPrintedState();

    private BillPrintedState() {
        //empty
    }

    public static BillPrintedState getInstance(){
        return uniqueInstance;
    }

    @Override
    public void makeReservation(Patron patron) {
        System.out.println("Please pay your bill before making a new reservation.");
    }

    @Override
    public void talkToHost(Patron patron) {
        System.out.println("Please provide payment to your waiter.");
    }

    @Override
    public void placeOrder(Patron patron, double price) {
        System.out.println("Changed your mind? No worries, we will reopen your bill.");
        patron.setState(patron.getOpenedBillState());
        patron.placeOrder(price);
    }

    @Override
    public void askForBill(Patron patron) {
        System.out.println("The bill is on the table.");
    }

    @Override
    public void payBill(Patron patron, double payment) {
        System.out.println("Thank you for paying $" + payment + ".");
        patron.adjustBalance(-1 * payment);
        double currentBal = patron.getBalance();
        if (currentBal > 0)
            System.out.println("Your remaining balance is $" + currentBal + ".");
        else if (currentBal == 0) {
            patron.adjustBalance(-1 * patron.getBalance());
            patron.setState(patron.getPaidState());
        }
        else {
            patron.adjustBalance(-1 * patron.getBalance());
            System.out.println("Thank you for your generous tip.");
            patron.setState(patron.getPaidState());
        }
    }

    @Override
    public void leave(Patron patron) {
        System.out.println("Dine and dash detected. Contacting police and issuing a lifetime ban.");
        patron.setState(patron.getBannedState());
    }

    @Override
    public String toString() {
        return "Patron has a printed bill.";
    }
}
