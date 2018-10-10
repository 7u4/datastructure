package org.datastructure.sort.insertion;


/**
 * Big O(n^2)
 */
public class InsertionSort {

    public static void sort(int[] elements) {

        for (int i = 1; i < elements.length; i++) {
            int element = elements[i];
            int j = i - 1;

            while (j >= 0 && elements[j] > element) {
                elements[j + 1] = elements[j];
                j--;
            }

            elements[j + 1] = element;
        }

    }
}
