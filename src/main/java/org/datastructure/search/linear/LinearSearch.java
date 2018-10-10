package org.datastructure.search.linear;

public class LinearSearch {

    public static int findIndex(int[] elements, int elem) {

        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == elem) {
                return i;
            }
        }

        return -1;
    }

    public static int findIndexRecursive(int[] elements, int elem) {
        return find(elements, elem, 0);
    }

    private static int find(int[] elements, int element, int index) {
        if (index == elements.length) {
            return -1;
        }

        if (elements[index] == element) {
            return index;
        }

        return find(elements, element, index+1);
    }

}
