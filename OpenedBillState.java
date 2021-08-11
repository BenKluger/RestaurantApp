/**
 * OpenedBillState:
 * One of seven concrete States for the State Design Pattern.
 * This is the State in which a Patron has an open bill. The Patron may continue placing orders or may choose to ask
 * for the bill. Requesting the bill is one State transition; choosing to leave at this point leads to another State
 * transition where the customer is marked as Banned for dining and dashing.
 *
 * @author Eyal Dalal
 */

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
        StateController.changeState(patron,"BillPrinted");
    }

    @Override
    public void payBill(Patron patron, double payment) {
        System.out.println("Bill has not yet been printed.");
    }

    @Override
    public void leave(Patron patron) {
        System.out.println("Dine and dash detected. Contacting police and issuing a lifetime ban.");
        StateController.changeState(patron,"Banned");
    }

    @Override
    public String toString() {
        return "Patron has an open bill.";
    }
}
