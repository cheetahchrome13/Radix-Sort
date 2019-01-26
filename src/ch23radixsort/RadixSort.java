package ch23radixsort;

import java.util.*;

/**
 * Class: RadixSort 
 * Tasks: 1) Creates and fills an array with random numbers 
 *        2) Sorts array
 * @author Justin Mangan
 */
public class RadixSort {

    private static int limit = 1_000_000;
    private static int[] ary = new int[limit];
    
    /**
     * @return the limit
     */
    public static int getLimit() {
        return limit;
    }

    /**
     * @param aLimit the limit to set
     */
    public static void setLimit(int aLimit) {
        limit = aLimit;
    }

    /**
     * Fills array with random numbers
     */
    public static void initializeArray() {
        for (int i = 0; i < limit; i++) {
            ary[i] = (int) (Math.random() * limit);
        }
    }

    /**
     * Returns array 
     * @return ary
     */
    public static int[] getAry() {
        return ary;
    }

    /**
     * Performs a Radix sort on array
     * @param <E> -- Generic reference type
     * @param x -- "Dummy" parameter to facilitate Consumer<T> interface
     */
    public static <E> void sort(int x) {
        for (int order = 1; order < limit; order *= 10) {

            ArrayList<Integer>[] bucket = new ArrayList[10];

            for (int i = 0; i < bucket.length; i++) {
                bucket[i] = new ArrayList<>();
            }

            for (int i = 0; i < ary.length; i++) {
                bucket[(ary[i] / order) % 10].add(ary[i]);
            }

            int k = 0;
            for (ArrayList<Integer> bucket1 : bucket) {
                if (bucket1 != null) {
                    for (int j = 0; j < bucket1.size(); j++) {
                        ary[k++] = bucket1.get(j);
                    }
                }
            }
        }
    }
}
