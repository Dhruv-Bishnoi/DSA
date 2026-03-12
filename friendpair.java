public class friendpair {

    public static int pair(int n ,int ways){

        if (n==0||n==1) {
            return 1;
            
        }


          ways =  pair(n-1,ways) + pair(n-2,ways);

         return ways;


    }
    public static void main(String[] args){
        System.out.println(pair(3,1));


    }
}
