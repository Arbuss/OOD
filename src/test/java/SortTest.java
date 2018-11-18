import factory.Factory;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;


public class SortTest {
    @Test
    public void bubbleSortTest(){
        int[] arr = {8, 9, 7, 6, 1, 1, 1, 1};
        int[] orderedArr = {1, 1, 1, 1, 6, 7, 8, 9};

        assertArrayEquals(orderedArr, Factory.factory(arr));
    }

    @Test
    public void selectionSortTest(){
        int[] arr = new int[101];
        for(int i = 100; i >= 0; i--){
            arr[100 - i] = i;
        }

        int[] orderedArr = new int[101];
        for(int i = 0; i < 101; i++){
            orderedArr[i] = i;
        }

        assertArrayEquals(orderedArr, Factory.factory(arr));
    }

    @Test
    public void heapSortTest(){
        int[] arr = new int[1001];
        for(int i = 1000; i >= 0; i--){
            arr[1000 - i] = i;
        }

        int[] orderedArr = new int[1001];
        for(int i = 0; i < 1001; i++){
            orderedArr[i] = i;
        }
        assertArrayEquals(orderedArr, Factory.factory(arr));
    }
}
