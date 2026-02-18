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
    public static void main(String[] args) {

        for(int i = 1;i<=10;i++){
            CheckPrime(i);
        }

            
    }
}
