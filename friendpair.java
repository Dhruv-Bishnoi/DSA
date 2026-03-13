public class friendpair {

    public static int pair(int n ){

        if (n==0||n==2) {
            return n;
            
        }


          int fnm1 = pair(n-1);

          int fmn2 = (n-1)*pair(n-2);

          int ways = fmn2 + fnm1;
          return ways;



          



    }
    public static void main(String[] args){
        System.out.println(pair(4));


    }
}
