import javax.print.DocFlavor.STRING;

public class mergesort {



    public static void SortUseingMerge(String arr[], int st, int end) {

        if (st >= end) return;

        int mid = st + (end - st) / 2;

        SortUseingMerge(arr, st, mid);
        SortUseingMerge(arr, mid + 1, end);

        merge(arr, st, end, mid);

    }

    public static void merge(String arr[] , int st , int end , int mid){

    String temp[] = new String[(end-st)+1];
    int i = st;
     int j = mid+1;
     int k =  0 ;



    while (i <= mid && j <= end) {
    
    if (arr[i].compareTo(arr[j]) < 0) {
        temp[k++] = arr[i++];
    } else {
        temp[k++] = arr[j++];
    }
}

     while (i <= mid) {
        temp[k++] = arr[i++];
    }

    while (j <= end) {
        temp[k++] = arr[j++];
    }
    
    for (i = st, k = 0; k < temp.length && i <= end; i++, k++) {
    arr[i] = temp[k];
}

    
}

    public static void main(String[] args) {
        String arr[] = {"apple","mango","banana","kivi","sheb"};
        SortUseingMerge(arr, 0, arr.length - 1);
        for(String x : arr){
            System.out.print(x + " ");
        }

    }

    
}