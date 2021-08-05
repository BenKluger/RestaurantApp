/**
 * Patron Class (Context):
 * Patron is the Context for the State Design Pattern. Customers logging into the restaurant application can be in
 * one of several states, depending on if they have a reservation, if they're seated, if they're ordering, if they're
 * paying, etc. Any action taken by a customer (making reservations, placing orders, paying, leaving, etc.) is handled
 * by the current state the Patron is in.
 *
 * Because there will be many Patrons existing at once, each State is a singleton shared among all Patron instances.
 * This preserves resources (only seven States are instantiated as opposed to 7n, where n is the number of Patrons).
 * For this to function, Patron instance is passed as a parameter for each method (rather than in State constructors,
 * as is the norm for non-Singleton implementation of the State Pattern).
 *
 * @author Eyal Dalal
 */

public class Patron {
    private State noReservationState = NoReservationState.getInstance();
    private State madeReservationState = MadeReservationState.getInstance();
    private State seatedState = SeatedState.getInstance();
    private State openedBillState = OpenedBillState.getInstance();
    private State billPrintedState = BillPrintedState.getInstance();
    private State paidState = PaidState.getInstance();
    private State bannedState = BannedState.getInstance();

    private State state = noReservationState; //initially all patrons will have no reservation
    private double balance = 0;

    public Patron(){
        //empty
    }

    //six possible actions; make reservation, talk to host, place order, ask for bill, pay bill, and leave
    //each action is delegated to the current state
    public void makeReservation() {
        state.makeReservation(this);
    }

    public void talkToHost() {
        state.talkToHost(this);
    }

    public void placeOrder(double price) {
        if (price < 0) System.out.println("Price cannot be negative!");
        else state.placeOrder(this, price);
    }

    public void askForBill() {
        state.askForBill(this);
    }

    public void payBill(double payment) {
        if (payment < 0) System.out.println("Payment cannot be negative!");
        else state.payBill(this, payment);
    }

    public void leave() {
        state.leave(this);
    }


    //set current state
    public void setState(State state) {
        this.state = state;
    }


    //getters for the seven states and the balance
    public State getNoReservationState() {
        return noReservationState;
    }

    public State getMadeReservationState() {
        return madeReservationState;
    }

    public State getSeatedState() {
        return seatedState;
    }

    public State getOpenedBillState() {
        return openedBillState;
    }

    public State getBillPrintedState() {
        return billPrintedState;
    }

    public State getPaidState() {
        return paidState;
    }

    public State getBannedState() {
        return bannedState;
    }

    public double getBalance() {
        return balance;
    }

    //adjust balance when making payments and orders
    public void adjustBalance(double val) {
        balance += val;
    }

    //toString to print balance and current state
    public String toString() {
        String result = "Patron info:\nCurrent balance: $" + balance + "\nCurrent state: " + state.toString();
        return result;
    }

    //getState included for unit testing; otherwise, not needed
    public State getState() {
        return state;
    }
}
