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
        patron.setState(patron.getMadeReservationState());
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
}
