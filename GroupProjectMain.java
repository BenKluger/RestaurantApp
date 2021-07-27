
/**
 * @Description This is the main method of our group project. Inside of it you will be able to call whichever design pattern you want to test.
 * 
 * @Authors Ben Kluger, (Please add your names to this list, or DM me your name and I will add you)
 * 
 */




import javax.swing.JOptionPane;

public class GroupProjectMain{


    public static void main(String[] args){

       // String customerName = JOptionPane.showInputDialog("Please enter your name: ");

       // JOptionPane.showMessageDialog(null, "The customer's name is: " + customerName);

        String customerOrder = JOptionPane.showInputDialog("Please enter the design pattern that you want to test. The choices are: Factory, ");

        if (customerOrder.equalsIgnoreCase("factory")){
            System.out.println("You have chosen the factory pattern.");
            //Include the code here to call the factory pattern
        }

    }


    
}