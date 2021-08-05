import java.util.ArrayList;
import java.util.List;

//notify the user of their food order status, that the order has been received by the restaurant 
public class FoodOrderNotify implements FoodSubject {
    //List for food orders
    private List<Observer> foodOrders = new ArrayList<>();
 
    @Override
    public void status(Observer order) {
        foodOrders.add(order);
    }
 
   @Override
    public void notifyUpdate(foodMessage fOrder) {
        for(Observer order: foodOrders) {
            order.update(fOrder);
        }
    }
}
