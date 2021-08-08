//foodMessage class will get the message content of the order
public class foodMessage 
{
    //messageContent is set to final cause we don't want to change the value.
    final String messageContent;
     
    public foodMessage (String fOrder) {
        //this keyword is used to be a reference to the current object.
        //Here, we invoke the messageContent string and set it to fOrder
        this.messageContent = fOrder;
    }
 
    public String getMessageContent() {
        return messageContent;
    }
}
