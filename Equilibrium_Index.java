public class Equilibrium_Index {
    
    public static void main(String[] args) {
        int arr[] = {-7, 1, 5, 2, -4, 3, 0};
       int totallsum = 0 ;
       int  leftsum = 0 ;

       for(int num:arr){
        totallsum+=num;
       }

       for(int i = 0 ; i<arr.length;i++){
        int rightsum = totallsum-leftsum-arr[i];

            if(rightsum==leftsum){
                System.out.println(i);
                return;
            }


            leftsum+=arr[i];

       }
        System.out.println(-1);
        
        }
        
    }

