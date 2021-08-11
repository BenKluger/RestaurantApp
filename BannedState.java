/**
 * BannedState:
 * One of seven concrete States for the State Design Pattern.
 * This is the State in which a Patron is marked as "banned for life" from the restaurant. This occurs for those
 * Patrons who choose to leave before completing payment of their bills. There is a possible State transition, though;
 * if a Patron pays the restaurant 1.5x their previously remaining balance, they are let off the hook "just this once."
 *
 * @author Eyal Dalal
 */

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
            patron.adjustBalance(-1 * patron.getBalance());
            StateController.changeState(patron,"NoReservation");
        }
        else
            System.out.println("That will not work. Please leave.");
    }

    @Override
    public void leave(Patron patron) {
        System.out.println("Please do not come back.");
    }

    @Override
    public String toString() {
        return "Patron is banned for life.";
    }
}
