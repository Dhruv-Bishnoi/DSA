public class mergesort {



    public static void SortUseingMerge(int arr[], int st, int end) {

        if (st >= end) return;

        int mid = st + (end - st) / 2;

        SortUseingMerge(arr, st, mid);
        SortUseingMerge(arr, mid + 1, end);

        merge(arr, st, end, mid);

    }

    public static void merge(int arr[] , int st , int end , int mid){

    int temp[] = new int[(end-st)+1];
    int i = st;
     int j = mid+1;
     int k =  0 ;



    while (i<=mid && j<=end) {
        
        if (arr[i]<arr[j]) {
            temp[k++]=arr[i++];
            
        }
        else{

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
        int arr[] = { 1, 3, 9, 6, 8, 2, 5 };
        SortUseingMerge(arr, 0, arr.length - 1);
        for(int x : arr){
            System.out.print(x + " ");
        }
    }
}