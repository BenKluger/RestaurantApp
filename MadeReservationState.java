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
        patron.setState(patron.getSeatedState());
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
        patron.setState(patron.getNoReservationState());
    }
}
