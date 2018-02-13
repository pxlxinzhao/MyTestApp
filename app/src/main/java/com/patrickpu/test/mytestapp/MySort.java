package com.patrickpu.test.mytestapp;

/**
 * Created by patrickpu on 2/13/2018.
 */

public class MySort {

    public static int[] bubbleSort(int[] array, Key key){
        int i,j,temp;

        for (i=0; i<array.length-1; i++){
            for (j=0; j<array.length-1-i; j++){
                if (array[j] > array[j+1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

        return array;
    }
}
