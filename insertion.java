import java.util.Arrays;

public class insertion {

    public static void main(String[] args) {
        
        int arr[] = {6,3,9,4,1,5,7};
       
       for (int i = 0; i < arr.length-1; i++) {
        int smallest = i;
        for (int j = i+1; j < arr.length; j++) {
            if (arr[smallest]>arr[j]) {
                smallest = j;
            }
            
        }
        int temp = arr[smallest];
        arr[smallest]=arr[i];
        arr[i]=temp;

        
       }
       System.out.println(Arrays.toString(arr));
    }
}