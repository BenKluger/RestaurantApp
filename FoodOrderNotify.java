import java.util.*;

public class FoodOrderNotify implements FoodSubject {
    
    private List<Proxy> foodOrders = new ArrayList<>();
 
    @Override
    public void status(Proxy order) {
        foodOrders.add(order);
    }
   @Override
    public void notifyTheUpdate(foodMessage foodOrder) {
        for(Proxy order: foodOrders) {
            order.update(foodOrder);
        }
    }
}
