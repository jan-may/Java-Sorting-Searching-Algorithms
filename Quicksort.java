import java.util.Arrays;

public class Quicksort{
    static int teilen(int[] arr, int begin, int end) {
        int pivot = end;

        int counter = begin;
        for (int i = begin; i < end; i++) {
            if (arr[i] < arr[pivot]) {
                int temp = arr[counter];
                arr[counter] = arr[i];
                arr[i] = temp;
                counter++;
            }
        }
        int temp = arr[pivot];
        arr[pivot] = arr[counter];
        arr[counter] = temp;
        return counter;
    }

    public static void quickSort(int[] array, int begin, int end) {
        if (end <= begin) return;
        int pivot = teilen(array, begin, end);
        quickSort(array, begin, pivot-1);
        quickSort(array, pivot+1, end);
    }

    public static void main(String[] args) {
        int[] data = {4, 35, 23, 5, 2, 67, 45, 21 , -2, 1};
        Quicksort.quickSort(data, 0, data.length-1);
        System.out.println(Arrays.toString(data));
    }
}