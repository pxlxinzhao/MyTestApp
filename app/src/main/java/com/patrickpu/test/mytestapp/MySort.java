package com.patrickpu.test.mytestapp;

class MySort {

    static int[] bubbleSort(int[] array, Key key){
        int i,j;

        for (i=0; i<array.length-1; i++){
            for (j=0; j<array.length-1-i; j++){
                if ( (key == Key.ASC && array[j] > array[j+1]) || (key == Key.DESC && array[j] < array[j + 1])){
                    swap(array, j, j+1);
                }
            }
        }

        return array;
    }

    static int[] insertionSort(int[] array){
        int i,j,cur;

        for (i=1; i<array.length; i++){
            cur = array[i];
            j = i-1;

            while(j>=0&&array[j]>cur){
                swap(array, j, j+1);
                j--;
            }
        }

        return array;
    }

    private static void swap(int[] array, int i, int j){
        int temp;
        temp = array[j];
        array[j] = array[i];
        array[i] = temp;
    }
}
