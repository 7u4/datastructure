package org.datastructure.search.binary;

public class BinarySearch {

    /**
     * Attention: the array must be sorted already!!!
     */
    public static int findIndex(int[] elements, int element) {
        int start = 0;
        int end = elements.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (elements[mid] == element) {
                return mid;
            } else if (elements[mid] > element) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }

    public static int findIndexRecursive(int[] elements, int element) {
        return findIndex(elements, element, 0, elements.length - 1);
    }

    private static int findIndex(int[] elements, int element, int start, int end) {
        if (start > end) {
            return -1;
        }

        int mid = (start + end) / 2;
        if (elements[mid] == element) {
            return mid;
        } else if (elements[mid] > element) {
            return findIndex(elements, element, start, mid - 1);
        } else {
            return findIndex(elements, element, mid + 1, end);
        }
    }
}
