package com.patrickpu.test.mytestapp;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by patrickpu on 2/13/2018.
 */

public class MySortUnitTest {

    @Test
    public void testBubbleSort(){
        int[] testArray = new int[]{3,8,6,9,2,4};
        int[] expectedArray = new int[]{2,3,4,6,8,9};

        assertArrayEquals(expectedArray, MySort.bubbleSort(testArray));
    }
}
