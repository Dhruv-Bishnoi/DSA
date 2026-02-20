public class reversearray {
    public static void main(String[] args) {
        int arry[]={3,2,1,8,2,5,7};
        int start = 0;
        int last = arry.length-1;

        while (start<last) {
            int temp = arry[last];
            arry[last] = arry[start];
            arry[start] = temp;
            start++;
            last--;
            
        }
        for (int i = 0; i < arry.length; i++) {
            System.out.println(arry[i]);
            
        }
    }

    
}
