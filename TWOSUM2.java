public class TWOSUM2 {
    public static int main(String[] args) {
        int nums[] = {3,5,3,14};
        int target = 9;
        
        for(int i = 0 ; i < nums.length;i++ ){

            for(int j = i; j<nums.length;j++){

                if((nums[i]+nums[j])==target){
                    System.out.println(i + " " + j);
                    return  target;
                }
            }
        }
        return -1 ;
    }
}
