
/**
 * @Description This is the main method of our group project. Inside of it you will be able to call whichever design pattern you want to test.
 *
 * @Authors Ben Kluger, Eyal Dalal, (Please add your names to this list, or DM me your name and I will add you)
 *
 */




import javax.swing.JOptionPane;
import java.util.Scanner;

public class GroupProjectMain{


    public static void main(String[] args){

        // String customerName = JOptionPane.showInputDialog("Please enter your name: ");

        // JOptionPane.showMessageDialog(null, "The customer's name is: " + customerName);

        String customerOrder = JOptionPane.showInputDialog("Please enter the design pattern that you want to test. The choices are: Factory, State, ");


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
            System.out.println("You have chosen the singleton pattern.");
            //include your driver code

        }

        //Decorator by Syed
        else if (customerOrder.equalsIgnoreCase("decorator")){
            System.out.println("You have chosen the decorator pattern.");
            //include your driver code
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


    }



}
