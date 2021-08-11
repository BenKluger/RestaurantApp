import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PadThaiTest {

    @Test
    void price() {
        //testing pad thai is correct price
        PadThai myDish = new PadThai();
        assertEquals(11, myDish.price());
    }

    @Test
    void getItemName() {
        //testing pad thai has correct item name
        PadThai myDish = new PadThai();
        assertEquals("Pad Thai", myDish.getItemName());
    }
}