public class mergesort {


    public static void SortUseingMerge(int arr[] , int st , int end ){

        
        if (st==end) {
            return ;
            
        }
        
        int mid = st+(end-st)/2;
        // System.out.println(arr[mid] + " " + mid);
        SortUseingMerge(arr, st, mid);
        SortUseingMerge(arr, mid+1, end);
        merge(arr, st, end, mid);






    }


    public static void merge(int arr[] , int st , int end , int mid){

    int temp[] = new int[(end-st)+1];
    int i = st;
     int j = mid+1;
     int k =  0 ;


     while (st<=mid && j<=end) {

        if (arr[i]<arr[j]) {
            temp[k++]=arr[i++];


            
        }

        else{
            temp[k++]=arr[j++];
        }

        while (i<=mid) {
        temp[k++]=arr[i++];


            
        }
        while (j<=mid) {
        temp[k++]=arr[j++];            
        }
        
        
     }

    

        


    }


    public static void main(String[] args) {
        int arr[] = {1,3,9,6,8,2,5};
        SortUseingMerge(arr, 0, arr.length);
        
    }
}