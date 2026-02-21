public class binTodec {


    public static void binaryTodec(int num){
        int power =0;
        int dec = 0 ;
        
        while(num>0){
            int lastdigit = num%10;
            dec = dec+(lastdigit * (int)Math.pow(2, power));
            num/=10;
            power++;
              }
        System.out.println(dec);
    }
    public static void main(String[] args) {
        binaryTodec(110);
        
    }
}
