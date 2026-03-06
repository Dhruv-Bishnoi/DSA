public class getith {


    public static void geti(int n , int i ){

        int bitmask = 1<<i;
        if ((n & bitmask) ==0 ) {
            System.out.println(0);
            
        }
        else{
            System.out.println(1);
        }


    }
    public static void main(String[] args) {
        geti(6, 0);
        
    }
}
