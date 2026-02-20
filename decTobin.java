public class decTobin {
    public static void decimalTobin(int n){
        int power = 0;
        int mod = 0;
        int num = 0;

        while(n>0){
            mod = n%2;
            n = n/2; 
            num = num+mod*((int)Math.pow(10, power));
            power++;

        }
        System.out.println(num);

    }
     public static void main(String[] args) {
        decimalTobin(12);
        
     }
}
