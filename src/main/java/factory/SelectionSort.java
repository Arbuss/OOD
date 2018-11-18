package factory;

import java.util.Arrays;
import java.util.Collections;

public class SelectionSort implements ISort {
    private int[] arr;

    public SelectionSort(int[] arr){
        this.arr = arr;
    }

    public int[] sort (){
        int min, temp;

        for (int index = 0; index < arr.length-1; index++){
            min = index;
            for (int scan = index+1; scan < arr.length; scan++){
                if (arr[scan] < arr[min])
                    min = scan;
            }

            // Swap the values
            temp = arr[min];
            arr[min] = arr[index];
            arr[index] = temp;
        }
        return arr;
    }
}

