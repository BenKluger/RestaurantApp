/**
 * StateController:
 * StateController class controls state changes given a particular patron and a desired state. This class aids in
 * decoupling state transitions from states by creating an alternate entrypoint into the state transition process.
 *
 * @author Eyal Dalal
 */

public class StateController {
    static final String NORES = "NoReservation";
    static final String RES = "MadeReservation";
    static final String SEATED = "Seated";
    static final String OPEN = "OpenedBill";
    static final String PRINT = "BillPrinted";
    static final String PAID = "Paid";
    static final String BAN = "Banned";

    public static void changeState(Patron p, String targetState){
        if (targetState == NORES)
            p.setState(p.getNoReservationState());
        else if (targetState == RES)
            p.setState(p.getMadeReservationState());
        else if (targetState == SEATED)
            p.setState(p.getSeatedState());
        else if (targetState == OPEN)
            p.setState(p.getOpenedBillState());
        else if (targetState == PRINT)
            p.setState(p.getBillPrintedState());
        else if (targetState == PAID)
            p.setState(p.getPaidState());
        else if (targetState == BAN)
            p.setState(p.getBannedState());
    }
}
