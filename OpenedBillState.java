public class OpenedBillState implements State {
    private static OpenedBillState uniqueInstance = new OpenedBillState();

    private OpenedBillState() {
        //empty
    }

    public static OpenedBillState getInstance(){
        return uniqueInstance;
    }


    @Override
    public void makeReservation(Patron patron) {
        System.out.println("Please complete your visit before attempting to make a new reservation.");
    }

    @Override
    public void talkToHost(Patron patron) {
        System.out.println("You are already seated.");
    }

    @Override
    public void placeOrder(Patron patron, double price) {
        System.out.println("Coming right up!");
        patron.adjustBalance(price);
    }

    @Override
    public void askForBill(Patron patron) {
        System.out.println("Printing bill... Your balance is " + patron.getBalance());
        patron.setState(patron.getBillPrintedState());
    }

    @Override
    public void payBill(Patron patron, double payment) {
        System.out.println("Bill has not yet been printed.");
    }

    @Override
    public void leave(Patron patron) {
        System.out.println("Dine and dash detected. Contacting police and issuing a lifetime ban.");
        patron.setState(patron.getBannedState());
    }

    @Override
    public String toString() {
        return "Patron has an open bill.";
    }
}
