package com.patrickpu.test.mytestapp;

/**
 * Created by patrickpu on 2/13/2018.
 */

public class MySort {

    public static int[] bubbleSort(int[] array, Key key){
        int i,j;

        for (i=0; i<array.length-1; i++){
            for (j=0; j<array.length-1-i; j++){
                if ( (key == Key.ASC && array[j] > array[j+1]) || (key == Key.DESC && array[j] < array[j + 1])){
                    swap(array, i, j);
                }
            }
        }

        return array;
    }

    public static void swap(int[] array, int i, int j){
        int temp;
        temp = array[j];
        array[j] = array[j+1];
        array[j+1] = temp;
    }
}
