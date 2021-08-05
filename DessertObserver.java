public class DessertObserver implements Observer 
{
    @Override
    public void update(foodMessage fOrder) {
        System.out.println("DessertObserver : " + fOrder.getMessageContent());
    }
}