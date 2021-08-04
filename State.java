/**
 * State Interface:
 * The State interface is implemented by all concrete State classes and represents the State of a Patron. Patron is
 * the Context for the State Design Pattern. State is implemented as an interface rather than an abstract class because
 * there is not enough shared functionality among all concrete States to justify use of an abstract class.
 *
 * @author Eyal Dalal
 */

public interface State {
    public void makeReservation(Patron patron);
    public void talkToHost(Patron patron);
    public void placeOrder(Patron patron, double price);
    public void askForBill(Patron patron);
    public void payBill(Patron patron, double payment);
    public void leave(Patron patron);

    public String toString();
}
