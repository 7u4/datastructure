package org.datastructure.sort.merge;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class MergeSortTest {

    @Test
    public void sort1() {
        int[] elements = {1, 4, 6, 8, 2, 3, 5, 7};

        MergeSort.sort(elements);

        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, elements);
    }

    @Test
    public void sort2() {
        int[] elements = {1, 2};

        MergeSort.sort(elements);

        assertArrayEquals(new int[]{1, 2}, elements);
    }

    @Test
    public void sort3() {
        int[] elements = {2, 1};

        MergeSort.sort(elements);

        assertArrayEquals(new int[]{1, 2}, elements);
    }

    @Test
    public void sort4() {
        int[] elements = {3, 2, 1};

        MergeSort.sort(elements);

        assertArrayEquals(new int[]{1, 2, 3}, elements);
    }

    @Test
    public void sort5() {
        int[] elements = {4, 3, 2, 1};

        MergeSort.sort(elements);

        assertArrayEquals(new int[]{1, 2, 3, 4}, elements);
    }

    @Test
    public void sort6() {
        int[] elements = {6, 5, 8, 7, 3, 4, 2, 1};

        MergeSort.sort(elements);

        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, elements);
    }
}