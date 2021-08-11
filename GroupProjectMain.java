
/**
 * @Description This is the main method of our group project. Inside of it you will be able to call whichever design pattern you want to test.
 *
 * @Authors Ben Kluger, Eyal Dalal, Kieun Bae, Syed Hasib, Momina Mim
 *
 */




import javax.swing.JOptionPane;
import java.util.Scanner;

public class GroupProjectMain{


    public static void main(String[] args){

        // String customerName = JOptionPane.showInputDialog("Please enter your name: ");

        // JOptionPane.showMessageDialog(null, "The customer's name is: " + customerName);

        String customerOrder = JOptionPane.showInputDialog("Please enter the design pattern that you want to test. The choices are: Factory, State, Singleton, Observer, Decorator.");


        //Factory by Ben
        if (customerOrder.equalsIgnoreCase("factory")){
            System.out.println("You have chosen the factory pattern.");
            //Include the code here to call the factory pattern

            DishFactory DishFactory = new DishFactory();

            //get an object of Appetizer and call its makeTheFood method.
            Dish dish1 = DishFactory.getDish("APPETIZER");

            //call makeTheFood method of Appetizer
            dish1.makeTheFood();

            //get an object of Entree and call its makeTheFood method.
            Dish dish2 = DishFactory.getDish("ENTREE");

            //call makeTheFood method of Entree
            dish2.makeTheFood();

            //get an object of Dessert and call its makeTheFood method.
            Dish dish3 = DishFactory.getDish("DESSERT");

            //call makeTheFood method of Dessert
            dish3.makeTheFood();

        }

        //Singleton by Momina
        else if (customerOrder.equalsIgnoreCase("singleton")){
            CustomerSingleton customer = new CustomerSingleton();
            ChefSingleton chef = new ChefSingleton();
            //Ordering
            customer.placeOrder();
            //Stop watch starts
            SingletonStopwatch stopwatch = SingletonStopwatch.Stopwatch();
            //preparing the order
            chef.prepareOrder();
            //printing the time elapsed
            System.out.println(stopwatch.getTime());

        }
        
        //Observer by Kieun
        else if (customerOrder.equalsIgnoreCase("observer")){
            System.out.println("You have chosen the observer pattern.");
        //Driver Code:
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

        //Decorator by Syed
        else if (customerOrder.equalsIgnoreCase("decorator")){
            System.out.println("You have chosen the decorator pattern.");

            ThaiDish dish1 = new PadThai();
            ThaiDish dish2 = new DrunkenNoodles();
            ThaiDish dish3 = new PeanutNoodles();
            ThaiDish dish4 = new BasilRice();
            ThaiDish dish5 = new PineappleRice();
            ThaiDish dish6 = new MassamanCurry();

            int option = 0;

            Scanner input = new Scanner(System.in);

            System.out.println("What would you like to order?");

            System.out.println("\nNoodle Dishes: ");
            System.out.println("[1] Pad Thai with Chicken");
            System.out.println("[2] Pad Kee Mao with Beef");
            System.out.println("[3] Peanut Noodles with Tofu");
            System.out.println("\nRice & Curry Dishes: ");
            System.out.println("[4] Basil Fried Rice with Pork");
            System.out.println("[5] Pineapple Fried Rice with Shrimp");
            System.out.println("[6] Massaman Curry with Duck");

            option = input.nextInt();

            switch (option) {

                case 1:
                    System.out.println("You have selected ");
                    dish1 = new Chicken(dish1);
                    System.out.println(dish1.getItemName() + "\nOrder Total: $" + dish1.price());
                    break;

                case 2:
                    System.out.println("You have selected ");
                    dish2 = new Beef(dish2);
                    System.out.println(dish2.getItemName() + "\nOrder Total: $" + dish2.price());
                    break;

                case 3:
                    System.out.println("You have selected ");
                    dish3 = new Tofu(dish3);
                    System.out.println(dish3.getItemName() + "\nOrder Total: $" + dish3.price());
                    break;

                case 4:
                    System.out.println("You have selected ");
                    dish4 = new Pork(dish4);
                    System.out.println(dish4.getItemName() + "\nOrder Total: $" + dish4.price());
                    break;

                case 5:
                    System.out.println("You have selected ");
                    dish5 = new Shrimp(dish5);
                    System.out.println(dish5.getItemName() + "\nOrder Total: $" + dish5.price());
                    break;

                case 6:
                    System.out.println("You have selected ");
                    dish6 = new Duck(dish6);
                    System.out.println(dish6.getItemName() + "\nOrder Total: $" + dish6.price());
                    break;

                default:
                    System.out.println("Invalid selection");
                    break;
            }
        }

        //State Design Pattern by Eyal
        else if (customerOrder.equalsIgnoreCase("state")){
            System.out.println("You have chosen the state pattern.");

            Scanner sc = new Scanner(System.in);
            int choice = 0;
            double amt;
            Patron patron = new Patron();

            System.out.println("Hello customer!");
            while(choice != 9){
                System.out.println("\nOptions:");
                System.out.println("[1] Make reservation.");
                System.out.println("[2] Talk to host to be seated.");
                System.out.println("[3] Place order with waiter.");
                System.out.println("[4] Ask for bill.");
                System.out.println("[5] Pay bill.");
                System.out.println("[6] Leave restaurant.");
                System.out.println("--------------------------------");
                System.out.println("[8] Print customer info and current state.");
                System.out.println("[9] Quit this design pattern demonstration.");

                System.out.print("Make a selection: ");
                choice = sc.nextInt();

                switch (choice){
                    case 1:
                        System.out.println();
                        patron.makeReservation();
                        break;
                    case 2:
                        System.out.println();
                        patron.talkToHost();
                        break;
                    case 3:
                        System.out.print("Price of order: $");
                        amt = sc.nextDouble();
                        System.out.println();
                        patron.placeOrder(amt);
                        break;
                    case 4:
                        System.out.println();
                        patron.askForBill();
                        break;
                    case 5:
                        System.out.print("Amount to pay: $");
                        amt = sc.nextDouble();
                        System.out.println();
                        patron.payBill(amt);
                        break;
                    case 6:
                        System.out.println();
                        patron.leave();
                        break;
                    case 8:
                        System.out.println();
                        System.out.println(patron.toString());
                        break;
                    case 9:
                        break;
                    default:
                        System.out.println();
                        System.out.println("Invalid option.");
                }

                System.out.println();
            }

            System.out.println("Thanks!");
        }


        System.out.println();
        System.out.println("--------------------");
        System.out.println("-----Thank you!-----");
        System.out.println("--Have a nice day!--");
        System.out.println("--------------------");


    }



}
