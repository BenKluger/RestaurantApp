public class EntreeProxy implements Proxy 
{
    public Proxy dessertProxy;
        @Override
    public void update(foodMessage foodOrder) {
        if(dessertProxy== null)
        {dessertProxy = new DessertProxy();}
        dessertProxy.update(foodOrder);
        System.out.println("EntreeProxy : " + foodOrder.getMessageContent());
    }
}
