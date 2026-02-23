import java.lang.reflect.Array;
import java.util.Arrays;

public class prefixsubarry {
    public static void main(String[] args) {
    int num[]= {-2,1,-3,4,-1,2,1,-5,4};
    int prefix []= new int[num.length];
    int currarry =0;
    int max_sum = Integer.MIN_VALUE;
    
    for(int i =0;i<num.length;i++){
        currarry+=num[i];
        prefix[i]=currarry;
        
    }
    
    for (int i = 0; i < num.length; i++) {
        int start = i;
        
        for (int k = i; k < num.length; k++) {
            int end = k;
                currarry= start==0 ? prefix[end] : prefix[end]-prefix[start-1];
                
                 if (currarry > max_sum) {
                    max_sum =currarry;
                }

            }

        }
        System.out.println("largest sum of array is " + max_sum);



    }
    
}
