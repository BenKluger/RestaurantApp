public class DessertProxy implements Proxy 
{
    private Proxy appetizerProxy;
    @Override
    public void update(foodMessage foodOrder) {
    
        if(appetizerProxy==null)
        {
        appetizerProxy = new AppetizerProxy();}
        appetizerProxy.update(foodOrder);
        System.out.println("DessertProxy : "+ foodOrder.getMessageContent());
    }
}
