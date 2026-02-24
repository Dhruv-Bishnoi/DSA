import java.lang.reflect.Array;
import java.util.Arrays;

public class twisearray {
    public static void main(String[] args) {
        int nums[] ={1,2,3,4,5,6,8,8};


        //using sorting

        Arrays.sort(nums);

        for (int i = 1; i < nums.length; i++) {
            if (nums[i]==nums[i-1]) {
                System.out.println(true);
                return;
                
            }

            
        }
        System.out.println(false);

        //using brute force
        // for (int i = 0; i < nums.length; i++) {
        //     for(int j = i+1;j<nums.length;j++){
        //         if (nums[i]==nums[j]) {
        //             System.out.println(true);
        //             return;
                    
        //         }
               
        //     }
            
            
        // }
        // System.out.println(false);




    }
}
