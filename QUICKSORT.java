import java.util.Arrays;

public class QUICKSORT {
    
    public static void main(String[] args) {

        int arr[] = {3,6,5,2,5,8,7};
        Quicksort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void Quicksort(int arr[], int st , int end){

        if (st >= end) return;

        int pivotIndex = partition(arr, st, end);

        Quicksort(arr, st, pivotIndex - 1);
        Quicksort(arr, pivotIndex + 1, end);
    }

    public static int partition(int arr[], int st , int end){

        int pivot = arr[end];
        int i = st - 1;

        for (int j = st; j < end; j++){
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        // place pivot at correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = temp;

        return i + 1;
    }
}