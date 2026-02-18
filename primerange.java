public class primerange {

    public static int CheckPrime(int n){
        if(n==1){
            return n;
        }

        for(int i = 2 ; i<=Math.sqrt(n);i++){
            if(n%i==0){
                return n;
            }
            
        }
        System.out.println(n);
        return n;
    }
    public static void main(String[] args) {

        for(int i = 1;i<=10;i++){
            CheckPrime(i);
        }

            
    }
}
