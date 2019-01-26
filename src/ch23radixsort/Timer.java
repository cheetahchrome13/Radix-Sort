
package ch23radixsort;

import java.util.function.*;

/**
 * Class: Timer
 * Tasks: Times the execution of given method
 * @author Justin Mangan
 */
public abstract class Timer{
    
    private static double elapsedTime;
    
    /**
     * Task: Starts timer, calls method, stops timer, returns elapsed time
     * @param <E> -- Generic reference type
     * @param x -- "Dummy" parameter to facilitate Consumer<T> interface
     * @param method -- method reference parameter
     * @return -- elapsedTime
     */
    public static <E> double startTimer(Integer dummy, Consumer<E> method){
        double startTime = System.currentTimeMillis();
        method.accept((E)dummy);
        double endTime = System.currentTimeMillis();
        setElapsedTime((endTime - startTime) / 1000);
        return elapsedTime;
    }
    
    /**-------------------------------------------------------------------------
     *                  THIS IS A DUMMY OVERLOADED METHOD FOR 
     *                  FUNCTIONAL INTERFACE LEARNING PURPOSES
     * @param <E> -- Generic reference type
     * @param x -- "Dummy" parameter to facilitate BiConsumer<T, T> interface
     * @param y -- "Dummy" parameter to facilitate BiConsumer<T, T> interface
     * @param method -- method reference parameter
     * @return -- elapsedTime 
     *------------------------------------------------------------------------*/
    public static <E> double startTimer(Integer dummy1, Integer dummy2, BiConsumer<E, E> method){
        double startTime = System.currentTimeMillis();
        method.accept((E)dummy1, (E)dummy2);
        double endTime = System.currentTimeMillis();
        setElapsedTime((endTime - startTime) / 1000);
        return elapsedTime;
    }
    
    /**-------------------------------------------------------------------------
     *                  THIS IS A DUMMY OVERLOADED METHOD FOR 
     *                  FUNCTIONAL INTERFACE LEARNING PURPOSES
     * @param x -- "Dummy" parameter to facilitate IntConsumer interface
     *          (Integer auto-unboxes -- can come in as a primitive int too)
     * @param method -- method reference parameter
     * @return -- elapsedTime 
     *------------------------------------------------------------------------*/
    public static double startTimer(Integer dummy, IntConsumer method){
        double startTime = System.currentTimeMillis();
        method.accept(dummy);
        double endTime = System.currentTimeMillis();
        setElapsedTime((endTime - startTime) / 1000);
        return elapsedTime;
    }
    
    /**
     * @return the elapsedTime
     */
    public static double getElapsedTime() {
        return elapsedTime;
    }

    /**
     * @param aElapsedTime the elapsedTime to set
     */
    public static void setElapsedTime(double aElapsedTime) {
        elapsedTime = aElapsedTime;
    } 
}
