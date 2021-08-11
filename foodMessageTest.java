import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    public class foodMessageTest {
     @Test
        void getMessageContent(){
         foodMessage foodmessage = new foodMessage("Test");

         //The good input will lead to the message being received.
         assertEquals("Test", foodmessage.getMessageContent());

     }
}
