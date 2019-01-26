
package ch23radixsort;

import java.util.function.*;

/**------------------------------------------------------------------
 * Project: Radix Sort
 * Tasks: 1) Performs a radix sort on an array of random numbers
 *        2) Displays results
 * @author Justin Mangan
 * Date: 7 April 2018
 *-------------------------------------------------------------------*/
public class SortTest {

    /**THE ABILITY TO PASS A METHOD CALL REFERENCE AS AN ARG IN A METHOD 
     * CALL IS AN INFINITELY USEFUL PART OF FUNCTIONAL PROGRAMMING. 
     * Package java.util.function.* imports FUNCTIONAL INTERFACES.
     * 
     * Main method implements functional interface Consumer<T>, passing method
     *  references to Timer.startTimer for improved code re-use. Integer "dummy" 
     *  parameters passed to Timer.startTimer are for Consumer method references
     *  to "consume"...executing the referenced method call in the process
     * @param args 
     */
    public static void main(String[] args) {
        int dummyInt = 0;
        Consumer<Integer> sortMethod = RadixSort::sort;
        Consumer<Integer> printMethod = Report::printArray;
        RadixSort.initializeArray();
        double sortTime = Timer.startTimer(dummyInt, sortMethod);
        double printTime = Timer.startTimer(dummyInt, printMethod);
        Report.printTime(sortTime, "\n\nTime to actually Radix Sort 1,000,000 "
                + "number sequences: ");
        Report.printTime(printTime, "\nTime to print out 1,000,000 number sequences: ");
   }
}
