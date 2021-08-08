//AppetizerObserver is a public class that will implement Observer in order to print the update for the appetizer section.
public class AppetizerObserver implements Observer 
{
    @Override
    // The update method will call the foodMessage fOrder to dislay the update.
    public void update(foodMessage fOrder) {
        System.out.println("AppetizerObserver: " + fOrder.getMessageContent());
    }
}
