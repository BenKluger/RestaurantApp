/*
 * Momina Mim
 * CSCI 370 Project - Restaurant App
 * SingletonStopwatch program will track the time from placement
 * of the order until the order is done. Singleton will ensure there's only one
 * stopwatch per order. No matter which class (who meaning cashier, chef, etc)
 * they will access to only one time.
 */

public class SingletonStopwatch {

    private static SingletonStopwatch stopwatch;
    private final long startTime;
    private long currentTime;

    private SingletonStopwatch() {
        startTime = System.currentTimeMillis();
        currentTime = 0;
    }

    //this will prevent classes from instantiating multiple instances
    public static synchronized SingletonStopwatch Stopwatch() {
        if(stopwatch == null) {
            stopwatch = new SingletonStopwatch();
        }
        return stopwatch;
    }

    public String getTime() {
        long timeElapsed;
        currentTime = System.currentTimeMillis();
        timeElapsed = currentTime - startTime;
        int minutes = (int) (timeElapsed/1000)/60;
        int seconds = (int) (timeElapsed/1000)%60;
        return ("Time elapsed since the order was placed - " + minutes +":"+ seconds + " (m:s)");
    }

}
