/**
 * MadeReservationState:
 * One of seven concrete States for the State Design Pattern.
 * This is the state in which a Patron has made a reservation and is ready to be seated. Two State transitions are
 * possible. The first is triggered by "speaking with the host" (an app functionality that marks arrival at the
 * restaurant). The second is a reservation cancellation, triggered by leaving (an option on the app as well as a
 * GPS-triggered event, perhaps).
 *
 * @author Eyal Dalal
 */

public class MadeReservationState implements State {
    private static MadeReservationState uniqueInstance = new MadeReservationState();

    private MadeReservationState(){
        //empty
    }

    public static MadeReservationState getInstance(){
        return uniqueInstance;
    }

    @Override
    public void makeReservation(Patron patron) {
        System.out.println("No need to make another reservation. Talk to the host to be seated.");
    }

    @Override
    public void talkToHost(Patron patron) {
        System.out.println("Welcome! The host will show you to your table.");
        StateController.changeState(patron,"Seated");
    }

    @Override
    public void placeOrder(Patron patron, double price) {
        System.out.println("Please have a seat before placing an order.");
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
        System.out.println("Have a good day. Your reservation has been cancelled.");
        StateController.changeState(patron,"NoReservation");
    }

    @Override
    public String toString() {
        return "Patron has a reservation.";
    }
}
