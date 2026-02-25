import java.util.*;

public class triple {

     public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList <List<Integer>>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                for (int j2 = 0; j2 < nums.length; j2++) {
                    if (nums[i]+nums[j]+nums[j2]==0) {
                        List<Integer> triplet = new ArrayList<Integer>();
                        triplet.add(nums[i]);
                        triplet.add(nums[j]);
                        triplet.add(nums[j2]);
                        Collections.sort(triplet);
                        result.add(triplet);
                        
                    }
                }
                
            }
            
        }
        result = new ArrayList<List<Integer>>(new LinkedHashSet<List<Integer>>(result));
        return result;


    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        System.out.println(threeSum(array));
        
    }
}
