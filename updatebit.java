public class updatebit {
    public static void main(String[] args) {
        int n  = 10;

        int i = 2;
        int bit = 1;

        if (bit == 0 ) {
            int bitmask = ~(1<<i);
            System.out.println(n&bitmask);

            
        }
        else{
            System.out.println(n|(1<<i));
        }
    }
}
