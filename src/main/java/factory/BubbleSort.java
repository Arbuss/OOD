package factory;

public class BubbleSort implements ISort{
    private int[] arr;

    public BubbleSort(int[] arr){
        this.arr = arr;
    }

    public int[] sort() {
        int i = 0;
        int goodPairsCounter = 0;
        while (true) {
            if (arr[i] > arr[i + 1]) {
                int q = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = q;
                goodPairsCounter = 0;
            } else {
                goodPairsCounter++;
            }
            i++;
            if (i == arr.length - 1) {
                i = 0;
            }
            if (goodPairsCounter == arr.length - 1) break;
        }
        return arr;
    }
}
