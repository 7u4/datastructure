package org.datastructure.sort.insertion;

import org.junit.Test;
import org.datastructure.sort.insertion.InsertionSort;

import java.util.Arrays;
import java.util.logging.Logger;

import static java.lang.String.format;
import static org.junit.Assert.assertArrayEquals;

public class InsertionSortTest {

    private Logger log = Logger.getLogger(this.getClass().getName());

    @Test
    public void sort() {
        int[] elements = new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        log.info(format("unsorted: %s", Arrays.toString(elements)));
        InsertionSort.sort(elements);

        log.info(format("sorted: %s", Arrays.toString(elements)));
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, elements);
    }

    @Test
    public void alreadySorted() {
        int[] a = {1, 2, 3};

        InsertionSort.sort(a);

        assertArrayEquals(new int[]{1, 2, 3}, a);
    }

    @Test
    public void duplicatedElements() {
        int[] a = {4, 1, 2, 3, 1};

        InsertionSort.sort(a);

        assertArrayEquals(new int[]{1, 1, 2, 3, 4}, a);
    }

    @Test
    public void sameElements() {
        int[] a = {1,1,1};

        InsertionSort.sort(a);

        assertArrayEquals(new int[]{1, 1, 1}, a);
    }
}