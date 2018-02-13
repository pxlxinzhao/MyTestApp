package com.patrickpu.test.mytestapp;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by patrickpu on 2/13/2018.
 */

public class MySortUnitTest {

    int[] testArray = new int[]{3,8,6,9,2,4};
    int[] expectedArrayAsc = new int[]{2,3,4,6,8,9};
    int[] expectedArrayDesc = new int[]{9,8,6,4,3,2};

    @Test
    public void testBubbleSortAsc(){
        assertArrayEquals(expectedArrayAsc, MySort.bubbleSort(testArray, Key.ASC));
    }
    @Test
    public void testBubbleSortDesc(){
        assertArrayEquals(expectedArrayDesc, MySort.bubbleSort(testArray, Key.DESC));
    }

}
