public class friendpair {

    public static int pair(int n ){

        if (n==0||n==2) {
            return 1;
            
        }


          int ways =  pair(n-1) + pair(n-2);



          

         return ways;


    }
    public static void main(String[] args){
        System.out.println(pair(4));


    }
}
