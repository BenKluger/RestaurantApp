/**
 * PatronTest:
 * Unit test using JUnit. Provides "good" and "bad" input to two different methods and ensures they handle these cases
 * as expected.
 *
 * @author Eyal Dalal
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PatronTest {

    @Test
    void makeReservation() {
        //testing "good" input leads to a state transition
        Patron patron = new Patron();
        patron.makeReservation();
        assertEquals(patron.getMadeReservationState(), patron.getState());

        //testing "bad" input leads to no state transition
        patron = new Patron();
        patron.setState(patron.getSeatedState());
        patron.makeReservation(); //nonsensical makeReservation() call; Patron is already seated
        assertEquals(patron.getSeatedState(), patron.getState());
    }

    @Test
    void placeOrder() {
        //testing "good" input leads to the proper change in balance
        Patron patron = new Patron();
        patron.setState(patron.getOpenedBillState());
        patron.placeOrder(30.00);
        assertEquals(30.00, patron.getBalance());

        //testing "bad" input leads to no change in balance
        patron.adjustBalance(-30.00); //return to balance of 0
        patron.placeOrder(-10.00); //no menu item is negatively priced; should reject
        assertEquals(0.00, patron.getBalance());
    }
}