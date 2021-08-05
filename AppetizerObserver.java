public class AppetizerObserver implements Observer 
{
    @Override
    public void update(foodMessage fOrder) {
        System.out.println("AppetizerObserver: " + fOrder.getMessageContent());
    }
}