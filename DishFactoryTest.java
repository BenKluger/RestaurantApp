import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DishFactoryTest {

    @Test
    void getDish() {
        DishFactory dishFactory = new DishFactory();

        //This is the "good" input, will lead to the creation of a new appetizer dish
        assertTrue(dishFactory.getDish("Appetizer") instanceof Appetizer);

        //This is the "Bad" input, will lead to a test failure
        assertFalse(dishFactory.getDish("Appetizer") instanceof Dessert);
    }
}