import java.util.ArrayList;
import java.util.List;
 
public class FoodOrderNotify implements FoodSubject {
     
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