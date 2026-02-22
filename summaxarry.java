public class summaxarry {
    public static void main(String[] args) {
      int nums[] = { -2,1,-3,4,-1,2,1,-5,4};
        int sumofarrry = 0;
        int max_sum = Integer.MIN_VALUE;

        
            for (int i = 0; i < nums.length; i++) {
                sumofarrry+=nums[i];
                
                    max_sum=Math.max(max_sum, sumofarrry);
                
                if(sumofarrry<=0){
                    sumofarrry=0;
                }
                

            }
            
        System.out.println("largest sum of array is " + max_sum);
    }
}
