import javax.print.DocFlavor.STRING;

public class sortestpath {
    public static void main(String[] args) {
        String str = "WNEENESENNN";

        int y = 0;

        int x = 0;

        for (int i = 0; i < str.length(); i++) {

            if ( str.charAt(i) == 'w') {
                x++;
                
            }
            else if (str.charAt(i)=='n') {
                y++;
                
            }
            else if (str.charAt(i)=='s') {
                y--;
                
            }
            else  {
                x--;
                
            }

            int x2 = x*x;
            int y2 = y*y;
             System.out.println( Math.sqrt(x2+y2));


            
        }
    }
}
