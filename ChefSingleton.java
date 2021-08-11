import java.util.Random;

public class ChefSingleton {

    public ChefSingleton() {

    }

    public void prepareOrder() {
        Random rand = new Random();
        //it will generate a random number between 1 to 5 seconds
        //note: this is just a simulation not a realistic time
        System.out.println("Preparing the order.");
        try {
            ////generating a random number between 1 and 5 and *1000 just to convert milliseconds to seconds
            Thread.sleep((rand.nextInt(5)+1)*1000);
            //Thread.sleep(10010);//to long for simple demonstration
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("The order is ready.");

    }

}
