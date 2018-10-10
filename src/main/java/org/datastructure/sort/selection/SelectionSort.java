package org.datastructure.sort.selection;


/**
 * Big O(n^2)
 */
public class SelectionSort {

    public static void sort(int[] elements) {
        for (int i = 0; i < elements.length; i++) {

            int min = i;

            for (int j = i+1; j < elements.length ; j++) {
                if (elements[j] < elements[min]) {
                    min = j;
                }
            }

            int temp = elements[i];
            elements[i] = elements[min];
            elements[min] = temp;
        }
    }
}
