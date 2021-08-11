//import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class SingletonTests {

    @Test
    void StopwatchTest() {
        SingletonStopwatch sw1 = SingletonStopwatch.Stopwatch();
        SingletonStopwatch sw2 = SingletonStopwatch.Stopwatch();
        //it should return true since both of these objects should point
        //to the same memory location
        assertTrue(sw1 == sw2);
        assertSame(sw1, sw2);
        //^assertTrue and assertSame do the same test. It's just different ways of doing it

        //the test below fails; that's what we want
        //Assert.assertNotSame(sw1, sw2);

        CustomerSingleton customer1 = new CustomerSingleton();
        CustomerSingleton customer2 = new CustomerSingleton();
        assertNotSame(customer1, customer2);
    }

    @Test
    void getTimeTest() {
        SingletonStopwatch sw1 = SingletonStopwatch.Stopwatch();
        ChefSingleton cs = new ChefSingleton();
        cs.prepareOrder();
        //this test checks the time is more than 0m:0s.
        assertFalse(
                ("Time Elapsed since the order was placed - " + 0 + ":" + 0 + " (m:s)").contentEquals(sw1.getTime()));
    }

}
