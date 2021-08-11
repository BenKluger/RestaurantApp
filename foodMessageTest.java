
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    public class foodMessageTest {
     @Test
        public foodMessage(){
         foodMessage foodmessage = new foodmessage();

         //The good input will lead to the message being received.
         assertTrue(foodmessage.this.messageContent) instanceof foodMessage);

        //bad input
         assertFalse(foodmessage.this.messageContent) instanceof entreeObserver );
     }
}