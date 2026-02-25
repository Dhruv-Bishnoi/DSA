import java.lang.reflect.Array;
import java.util.Arrays;

public class bubble {
    public static void main(String[] args) {
        int array[] = {5,4,3,2,1};

        for (int i = 0; i <array.length-1; i++) {

          
            for (int j = i+1; j < array.length; j++) {
                if (i<j) {
                    int temp = array[j];
                    array[j]=array[i];
                    array[i]=temp;
                }
                
            }
            
        }
        System.out.println(Arrays.toString(array));
    }
}
