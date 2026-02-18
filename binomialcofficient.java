public class binomialcofficient {

    public static int factorial(int n){
        int f = 1;
        for(int i = 1; i<=n;i++){
            f*=i;
            
        }
        return f;

    }

    public static void cofficient(int n,int r){

       int c = factorial(n)/(factorial(r)*factorial(n-r));
        System.out.println(c);
    }
    public static void main(String[] args) {

        int c = 5;
        int r = 2;
        cofficient(c, r);
        System.out.println();


        
    }

    
}
