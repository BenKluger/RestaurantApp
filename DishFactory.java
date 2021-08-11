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

}