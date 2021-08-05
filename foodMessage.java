public class foodMessage 
{
    final String messageContent;
     
    public foodMessage (String fOrder) {
        this.messageContent = fOrder;
    }
 
    public String getMessageContent() {
        return messageContent;
    }
}