public class Patron {
    State noReservationState = NoReservationState.getInstance();
    State madeReservationState = MadeReservationState.getInstance();
    State seatedState = SeatedState.getInstance();
    State openedBillState = OpenedBillState.getInstance();
    State billPrintedState = BillPrintedState.getInstance();
    State paidState = PaidState.getInstance();
    State bannedState = BannedState.getInstance();

    State state = noReservationState; //initially all patrons will have no reservation
    double balance = 0;

    //empty constructor
    public Patron(){
        //
    }

    //six possible actions; make reservation, talk to host, place order, ask for bill, pay bill, and leave
    //each action is delegated to the current state
    //current Patron instance is passed in these calls rather than state constructors because the states are singletons
    public void makeReservation() {
        state.makeReservation(this);
    }

    public void talkToHost() {
        state.talkToHost(this);
    }

    public void placeOrder(double price) {
        state.placeOrder(this, price);
    }

    public void askForBill() {
        state.askForBill(this);
    }

    public void payBill(double payment) {
        state.payBill(this, payment);
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
}
