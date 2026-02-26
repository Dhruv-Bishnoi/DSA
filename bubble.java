import java.lang.reflect.Array;
import java.util.Arrays;

public class bubble {
    public static void main(String[] args) {
        int array[] = {5,3,4,6,2};

        for (int i = 0; i <array.length-1; i++) {

          
            for (int j = 0; j < array.length-1-i; j++) {
                if (array[j]>array[j+1]) {
                    int temp = array[j+1];
                    array[j+1]=array[j];
                    array[j]=temp;

                    System.out.println(Arrays.toString(array));
                }
                
            }
            
        }
    }
}
