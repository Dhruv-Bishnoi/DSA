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

    public static int firstoccur(int arr[],int key,int i){

        if(i == arr.length){
        return -1;
    }

        if(arr[i] == key){
            return i;
         }


        return firstoccur(arr, key, i+1);






    }
    public static int lastoccur(int arr[],int key,int i){

    if (arr.length==i) {
        return -1;

    }
    int found =  lastoccur(arr, key, i+1);

    if (found==-1 && arr[i]==key ) {

        return i;
        
    }

  
    return found;


    }

    public static int power(int x, int n ){

        if(n == 0){
            return 1;
        }

        int xn = x*power(x, n-1);

        return xn;
    }


    public static int optimizepower(int x,int n){

        if (n==0) {
            return 1;
            
        }
        System.out.println(n + " n");
        int halfsq = optimizepower(x, n/2);
        
        int fullsq = halfsq* halfsq;
        

        if (n % 2!=0) {
            System.out.println(fullsq + "before");
            
            fullsq = x *fullsq;
            
            System.out.println(fullsq + " full sq " + n);

            
        }

        return fullsq;
    }


          
    public static void main(String[] args) {
        int arr[]= {1,9,3,4,9,8,8};

        System.out.println(optimizepower(2,10));
        
        
    }
}
