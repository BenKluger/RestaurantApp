/**
 * PaidState:
 * One of seven concrete States for the State Design Pattern.
 * This is the State in which the Patron has fully paid their bill. Reseating is not possible without making a new
 * reservation, however attempting to place an order while still seated will cause a State transition into opening
 * a new bill. Another State transition is possible by leaving.
 *
 * @author Eyal Dalal
 */

public class PaidState implements State {
    private static PaidState uniqueInstance = new PaidState();

    private PaidState() {
        //empty
    }

    public static PaidState getInstance(){
        return uniqueInstance;
    }


    @Override
    public void makeReservation(Patron patron) {
        System.out.println("Another reservation already? OK, reservation confirmed.");
        patron.setState(patron.getMadeReservationState());
    }

    @Override
    public void talkToHost(Patron patron) {
        System.out.println("If you'd like to be reseated, please make a new reservation.");
    }

    @Override
    public void placeOrder(Patron patron, double price) {
        System.out.println("Not ready to go yet? No worries. New bill opened.");
        patron.adjustBalance(3.00); //new bill means new service fee
        patron.adjustBalance(price);
        patron.setState(patron.getOpenedBillState());
    }

    @Override
    public void askForBill(Patron patron) {
        System.out.println("You have no open bill.");
    }

    @Override
    public void payBill(Patron patron, double payment) {
        System.out.println("You just paid.");
    }

    @Override
    public void leave(Patron patron) {
        System.out.println("Thank you for dining with us. Come back soon!");
        patron.setState(patron.getNoReservationState());
    }

    @Override
    public String toString() {
        return "Patron has paid bill.";
    }
}
