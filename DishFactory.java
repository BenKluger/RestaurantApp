import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * 
 */

public class DishFactory {
    //use getDish method to get object of type Dish
   public Dish getDish(String dishType){
    if(dishType == null){
       return null;
    }		
    if(dishType.equalsIgnoreCase("Appetizer")){
       return new Appetizer();
       
    } else if(dishType.equalsIgnoreCase("Entree")){
       return new Entree();
       
    } else if(dishType.equalsIgnoreCase("Dessert")){
       return new Dessert();
    }
    
    return null;
 }

@Test
public void testGetDish(){

   //This is the "good" input, will lead to the creation of a new appetizer dish
   assertEquals(new Appetizer(), getDish("Appetizer"));

   //This is the "Bad" input, will lead to a test failure
   assertEquals(new Dessert(), getDish("Appetizer"));
}

}