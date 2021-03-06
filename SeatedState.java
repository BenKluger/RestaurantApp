/**
 * SeatedState:
 * One of seven concrete States for the State Design Pattern.
 * The State in which a Patron is seated and ready to order. Two transitions are possible: one by placing an order and
 * opening a new bill, and one by leaving which cancels the reservation.
 *
 * @author Eyal Dalal
 */

public class SeatedState implements State {
    private static SeatedState uniqueInstance = new SeatedState();

    private SeatedState() {
        //empty
    }

    public static SeatedState getInstance(){
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
        patron.adjustBalance(3.00); //all new bills incur an automatic $3.00 service fee
        patron.adjustBalance(price);
        StateController.changeState(patron,"OpenedBill");
    }

    @Override
    public void askForBill(Patron patron) {
        System.out.println("You haven't ordered anything yet.");
    }

    @Override
    public void payBill(Patron patron, double payment) {
        System.out.println("You have no bill to pay.");
    }

    @Override
    public void leave(Patron patron) {
        System.out.println("Have a good day. Your table has been given up and your reservation is cancelled.");
        StateController.changeState(patron,"NoReservation");
    }

    @Override
    public String toString() {
        return "Patron is seated and has not yet ordered.";
    }
}
