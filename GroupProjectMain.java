
import java.util.*;

public class GroupProjectMain{
    
    public static void main(String[] args){

       Scanner sc = new Scanner(System.in);
       String customerOrder = " ";
       System.out.println("Please enter the design pattern that you want to test. The choices are: observer, singleton,decorator, Factory, State, ");
        
        customerOrder = sc.nextLine();
        //Factory by 
        if (customerOrder.equalsIgnoreCase("factory")){
            System.out.println("You have chosen the factory pattern.");
        }

        //Singleton by 
        else if (customerOrder.equalsIgnoreCase("singleton")){
            System.out.println("You have chosen the singleton pattern.");
        }
        
        //Proxy by Moha
        else if (customerOrder.equalsIgnoreCase("proxy")){
            System.out.println("You have chosen the proxy pattern.");
            
          
            Proxy entreeWork = new EntreeProxy();
            FoodOrderNotify OrderFeed = new FoodOrderNotify();
            
            OrderFeed.status(entreeWork);
         

            OrderFeed.notifyTheUpdate(new foodMessage("Order has been received and chef are working!")); 
            
            System.out.println("\nRestaurant Order Update: ");
             
            OrderFeed.notifyTheUpdate(new foodMessage("Feed is now ready to be served! Enjoy your feed!"));
  
            System.out.println("\nThank You For choosing our restaurant ");
            
           }
        //Decorator by 
        else if (customerOrder.equalsIgnoreCase("decorator")){
            System.out.println("You have chosen the decorator pattern.");
            //include your driver code
        }

        //State Design Pattern by 
        else if (customerOrder.equalsIgnoreCase("state")){
        System.out.println("You have chosen of State pattern.");
        
        }

    }
}
