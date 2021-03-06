/**
 * BillPrintedState:
 * One of seven concrete States for the State Design Pattern.
 * This is the State in which the bill has been printed and payment becomes possible. Payment leads to a State
 * transition only when the balance has been totally covered; any excess payment is considered tip. Leaving at this
 * point causes a State transition into the BannedState for dining and dashing. The customer also has the option to
 * reopen their bill by placing a new order.
 *
 * @author Eyal Dalal
 */

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
        StateController.changeState(patron,"OpenedBill");
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
            StateController.changeState(patron,"Paid");
        }
        else {
            patron.adjustBalance(-1 * patron.getBalance());
            System.out.println("Thank you for your generous tip.");
            StateController.changeState(patron,"Paid");
        }
    }

    @Override
    public void leave(Patron patron) {
        System.out.println("Dine and dash detected. Contacting police and issuing a lifetime ban.");
        StateController.changeState(patron,"Banned");
    }

    @Override
    public String toString() {
        return "Patron has a printed bill.";
    }
}
