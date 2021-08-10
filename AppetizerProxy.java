public class AppetizerProxy implements Proxy 
{
    @Override
    public void update(foodMessage foodOrder) {
        System.out.println("AppetizerProxy: " + foodOrder.getMessageContent());
    }
}
