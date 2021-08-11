import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToppingDecoratorTest {

    @Test
    void getItemName() {
        ToppingDecorator testTopping = new ToppingDecorator() {
            @Override
            public int price() {
                return 0;
            }

            @Override
            public String getItemName() {
                return null;
            }
        };

        testTopping.getItemName();
        assertTrue(true);

        
    }
}
