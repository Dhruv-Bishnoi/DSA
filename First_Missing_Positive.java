public class First_Missing_Positive {
    public static void main(String[] args) {
        int arr[] = {-2,-1,2,4,1};
        int n = arr.length;
    
        for(int i = 0 ; i<n;i++){
            while(arr[i]>0 && arr[i]<=n && arr[arr[i]-1]!=arr[i]){
                int index = arr[i]-1;
                int temp = arr[index];
                arr[index] = arr[i];
                arr[i]=temp;
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] != i + 1) {
                System.out.println("missing number : " + (i + 1));
                return;
            }
        }


    }
}
