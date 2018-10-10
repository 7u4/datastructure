package org.datastructure.sort.merge;


import java.util.Arrays;
import java.util.logging.Logger;

/**
 * Big O(n log n)
 * create new arrays
 */
public class MergeSort {

    private static Logger log = Logger.getLogger(MergeSort.class.getName());

    public static void sort(int[] elements) {
        mergeSort(elements, 0, elements.length - 1);
    }

    private static void mergeSort(int[] elements, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            mergeSort(elements, start, mid);
            mergeSort(elements, mid + 1, end);
            merge2(elements, start, mid, end);

            Arrays.stream(new long[]{1L,2L,3L})
                    .sum();
        }
    }

    public static void merge(int[] elements, int start, int mid, int end) {
        int lEnd = mid - start + 1;
        int rEnd = end - mid;

        int[] lArray = new int[lEnd];
        int[] rArray = new int[rEnd];

        for (int i = 0; i < lEnd; i++) {
            lArray[i] = elements[start + i];
        }

        for (int j = 0; j < rEnd; j++) {
            rArray[j] = elements[mid + 1 + j];
        }

        log.info("lEnd: " + lEnd + ", lArray: " + Arrays.toString(lArray));
        log.info("rEnd: " + rEnd + ", rArray: " + Arrays.toString(rArray));

        int i = 0, j = 0, k = start;

        while (i < lEnd && j < rEnd) {
            if (lArray[i] <= rArray[j]) {
                elements[k] = lArray[i];
                i++;
            } else {
                elements[k] = rArray[j];
                j++;
            }
            k++;
        }

        while (i < lEnd) {
            elements[k] = lArray[i];
            k++;
            i++;
        }

        while (j < rEnd) {
            elements[k] = rArray[j];
            k++;
            j++;
        }

        log.info("elements: " + Arrays.toString(elements));
    }

    public static void merge2(int[] elements, int start, int mid, int end) {

        int lStart = start;
        int rStart = mid + 1;

        int[] temp = new int[end - start + 1];

        int k = 0;

        for (int i = start; i <= end; i++) {
            if (lStart > mid)      // checks if first part comes to an end or not .
                temp[k++] = elements[rStart++];

            else if (rStart > end)   // checks if second part comes to an end or not
                temp[k++] = elements[lStart++];

            else if (elements[lStart] < elements[rStart]) // checks which part has smaller element.
                temp[k++] = elements[lStart++];

            else
                temp[k++] = elements[rStart++];
        }

        for (int p = 0; p < k; p++) {
            elements[start++] = temp[p];
        }

        log.info("elements: " + Arrays.toString(elements));
    }
}
