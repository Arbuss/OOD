package factory;

import java.util.Random;

public class Factory {
    public static int[] factory(int[] arr){
        if(arr.length <= 100)
            return new BubbleSort(arr).sort();
        if(arr.length <= 1000)
            return new SelectionSort(arr).sort();

        return new HeapSort(arr).sort();
    }
}
