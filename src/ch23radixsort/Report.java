
package ch23radixsort;

/**
 * Class: Report
 * Tasks: Prints results to console
 * @author Justin Mangan
 */
public class Report {
    
    /**
     * Prints array indexes to console 
     * @param x -- "Dummy" parameter to facilitate Consumer<T> interface
     */
    public static void printArray(int x){
        int count = 1;
        int[] array = RadixSort.getAry();
        for(int num : array)
            System.out.print(count++ % 10 == 0 && count != array.length + 1 ? 
                    num + "\n" : count < array.length + 1 ? num + ", " : num);
    }
    
    /**
     * Prints formatted string using passed-in parameters
     * @param elapsedTime
     * @param msg 
     */
    public static void printTime(double elapsedTime, String msg){
        int limit = RadixSort.getLimit();
        System.out.printf(msg + "\033[31m%1.3f%c\033[0m\n", elapsedTime, 's');
    }    
}
