public class EntreeObserver implements Observer 
{
    @Override
    public void update(foodMessage fOrder) {
        System.out.println("EntreeObserver : " + fOrder.getMessageContent());
    }
}