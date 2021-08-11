/**
 * NoReservationState:
 * One of seven concrete States for the State Design Pattern.
 * This is the initial State for a Patron, in which no reservation exists. This is also the State in which Patrons who
 * have completed their previous interactions exist (by paying, if needed, and leaving). One State transition is
 * possible, triggered by making a reservation.
 *
 * @author Eyal Dalal
 */

public class NoReservationState implements State {
    private static NoReservationState uniqueInstance = new NoReservationState();

    private NoReservationState() {
        //empty
    }

    public static NoReservationState getInstance(){
        return uniqueInstance;
    }

    @Override
    public void makeReservation(Patron patron) {
        System.out.println("Reservation confirmed! Please talk to the host to be seated.");
        StateController.changeState(patron,"MadeReservation");
    }

    @Override
    public void talkToHost(Patron patron) {
        System.out.println("You must make a reservation in order to be seated.");
    }

    @Override
    public void placeOrder(Patron patron, double price) {
        System.out.println("You must be seated in order to place an order.");
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
        System.out.println("Have a good day.");
    }

    @Override
    public String toString() {
        return "Patron has no reservation.";
    }
}
