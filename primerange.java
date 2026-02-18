public class primerange {

    public static void CheckPrime(int n){
        if(n==1){
            return;
        }

        for(int i = 2 ; i<=Math.sqrt(n);i++){
            if(n%i==0){
                return ;
            }
            
        }
        System.out.println(n);
        return ;
    }

    public static void range(int n){

        for(int i = 1;i<=n;i++){
            CheckPrime(i);
        }
        return;
    }
    public static void main(String[] args) {


        range(14);


            
    }
}
