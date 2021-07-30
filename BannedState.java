public class BannedState implements State {
    private static BannedState uniqueInstance = new BannedState();

    private BannedState(){
        //empty
    }

    public static BannedState getInstance(){
        return uniqueInstance;
    }

    @Override
    public void makeReservation(Patron patron) {
        System.out.println("You are banned from this restaurant.");
    }

    @Override
    public void talkToHost(Patron patron) {
        System.out.println("You are banned from this restaurant.");
    }

    @Override
    public void placeOrder(Patron patron, double price) {
        System.out.println("You are banned from this restaurant.");
    }

    @Override
    public void askForBill(Patron patron) {
        System.out.println("You are banned from this restaurant.");
    }

    @Override
    public void payBill(Patron patron, double payment) {
        if (payment > patron.getBalance() * 1.5) {
            System.out.println("Well... we will unban you, just this once.");
            patron.setState(patron.getNoReservationState());
        }
        else
            System.out.println("That will not work. Please leave.");
    }

    @Override
    public void leave(Patron patron) {
        System.out.println("Please do not come back.");
    }
}
