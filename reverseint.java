public class reverseint {
    public static void main(String[] args) {
        int x = 121;
        int tempX = x;
        int reversed = 0;


        if (x<0) {
            return;
            
        }
        while (x!=0) {
            int ditigit = x%10;
            reversed = reversed*10+ditigit;
            x/=10;
        }

        if (tempX==reversed) {
            
            System.out.println("yes");
        }
        
    }
}
