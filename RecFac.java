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


    public static boolean issorted(int arr[],int i) {
        
        if (i==arr.length-1) {
            return true;
        }

        if (arr[i]>arr[i+1]) {
            return false;
        }



        return issorted(arr, i+1);
    }


    
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5,6,9,8};

        System.out.println(issorted(arr, 0));
        
        
    }
}
