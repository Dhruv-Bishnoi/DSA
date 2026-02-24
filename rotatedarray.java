public class rotatedarray {

    public static int search(int num[] , int target){

        int left =0;
        int right = num.length-1;

        while (left<=right) {
            int mid = (left+right)/2;

            if(num[mid]==target){
                return mid;
            }

        // target can not be in left side
            if (num[left]>num[right]) {

                if(num[left]<target&&target<mid){
                    right =mid-1;
                }
                right =mid-1;


              
            
            }
        }


        
        


    }

    public static void main(String[] args) {

        int nums[] = {4,5,6,7,0,1,2}, target = 0;

        search(nums, target);


        
    }
}
