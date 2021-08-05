public class FoodOrderObserverDemo 
{
    public static void main(String[] args) 
    {
        //check from appetizer, dessert or entree
        AppetizerObserver appetizer = new AppetizerObserver();
        DessertObserver dessert = new DessertObserver();
        EntreeObserver entree = new EntreeObserver();
        
        //Observer pattern will work to notify you on the status of the order.
        FoodOrderNotify mealOrder = new FoodOrderNotify();
        System.out.println("\nThank you for your order! We have notified the restaurant!");

        //get the status of the orders
        mealOrder.status(appetizer);
        mealOrder.status(dessert);
        mealOrder.status(entree);

        //notify user that the order has been received and the restaurant is making it.
        mealOrder.notifyUpdate(new foodMessage("Order has been received and is in the works!"));   
        
        //update the order
        System.out.println("\nRestaurant Order Update: ");
        
        //notify user that the meal is now ready.
        mealOrder.notifyUpdate(new foodMessage("Meal is now ready to be served! Enjoy your meal!")); 
    }
}