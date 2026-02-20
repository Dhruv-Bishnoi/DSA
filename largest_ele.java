public class largest_ele {

    public static void find_largest(int arry[]){
        int largest_num = Integer.MIN_VALUE;

        for(int i = 0 ;i<arry.length;i++){
            if (arry[i]>=largest_num) {
                largest_num = arry[i];

            }
        } 

        
        System.out.println(largest_num);
    }
    public static void main(String[] args) {
        int arry[] ={1,55,7,8,96,4,37,8};
        find_largest(arry);
        
    }
    
}
