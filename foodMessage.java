
public class foodMessage 
{
    final String messageContent;
     
    public foodMessage (String foodOrder) {
        
        this.messageContent = foodOrder;
    }
 
    public String getMessageContent() {
        return messageContent;
    }
}
