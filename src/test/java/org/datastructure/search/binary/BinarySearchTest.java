package org.datastructure.search.binary;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.datastructure.search.binary.BinarySearch.findIndex;
import static org.datastructure.search.binary.BinarySearch.findIndexRecursive;

public class BinarySearchTest {

    private int[] elements = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    @Before
    public void setUp() {
        Arrays.sort(elements);
    }

    @Test
    public void findFirst() {
        assertEquals(0, findIndex(elements, 1));
        assertEquals(1, findIndex(elements, 2));
        assertEquals(9, findIndex(elements, 10));
        assertEquals(-1, findIndex(elements, 99));
    }

    @Test
    public void findFirstRecursive() {
        assertEquals(0, findIndexRecursive(elements, 1));
        assertEquals(1, findIndexRecursive(elements, 2));
        assertEquals(9, findIndexRecursive(elements, 10));
        assertEquals(-1, findIndexRecursive(elements, 99));
    }


}