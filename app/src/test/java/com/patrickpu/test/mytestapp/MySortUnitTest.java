package com.patrickpu.test.mytestapp;

import org.junit.Test;
import static org.junit.Assert.*;

public class MySortUnitTest {

    private int[] testArray = new int[]{3,8,6,9,2,3};
    private int[] expectedArrayAsc = new int[]{2,3,3,6,8,9};
    private int[] expectedArrayDesc = new int[]{9,8,6,3,3,2};

    @Test
    public void testBubbleSortAsc(){
        assertArrayEquals(expectedArrayAsc, MySort.bubbleSort(testArray, Key.ASC));
    }
    @Test
    public void testBubbleSortDesc(){
        assertArrayEquals(expectedArrayDesc, MySort.bubbleSort(testArray, Key.DESC));
    }
    @Test
    public void testInsertionSort(){
        assertArrayEquals(expectedArrayAsc, MySort.insertionSort(testArray));
    }

}
