public class RecFac {

    public static int fac(int n ){
        if (n==0) {
            return 1;
            
        }
        
        return n*fac(n-1);
        
        
        
    }

    public static int sum(int n ){
        if (n==1) {
            return 1;
            
        }
        
        int smm = sum(n-1);
        int summ = n + smm ;
        
        return summ;
        
        
        
    }
    public static int febonacci(int n ){
        

        if (n==1 || n==0) {
            return n;
            
        }
       

        int febon = febonacci(n-1)+ febonacci(n-2);

        return febon;

       
        
        
        
        
    }



    
    public static void main(String[] args) {
        int n = 40;
        System.out.println(febonacci(n));
        
    }
}
