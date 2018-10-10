package org.datastructure.sort.quick;


/**
 * Big O(n log n) , in the worst case, it can be n^2
 * does not create new arrays
 */
public class QuickSort {


    public static void sort(int[] elements) {
        quickSort(elements, 0, elements.length - 1);
    }

    private static void quickSort(int[] elements, int start, int end) {
        if (start < end) {
            int partitionPoint = partition(elements, start, end);
            quickSort(elements, 0, partitionPoint-1);
            quickSort(elements, partitionPoint+1, end);
        }
    }

    private static int partition(int[] elements, int start, int end) {
        int pp = elements[end];
        int i = start -1;

        for (int j = start; j < end; j++) {
            if (elements[j] <= pp) {
                int jElement = elements[j];
                elements[j] = elements[++i];
                elements[i] = jElement;
            }
        }

        int iElement = elements[++i];
        elements[i] = pp;
        elements[end] = iElement;

        return i;
    }
}
