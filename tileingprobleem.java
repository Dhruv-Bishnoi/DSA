public class tileingprobleem {

    public static int countways(int x){

        if (x==0 || x==1) {
            return 1;
            
        }

        int fnm1 = countways(x-1);
        int fnm2 = countways(x-2);
        
        int ways = fnm1 + fnm2;

        return ways;

    }
     public static void main( String[]  args){

        System.out.println(countways(4));
        

     }
     
}
