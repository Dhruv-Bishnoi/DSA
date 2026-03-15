public class binarystring {

    public static void printstring(String s , int last , int n){


            if (n==0) {

                
                System.out.println(s);
                return;
            }


            printstring(s+("0"), 0, n-1);
            if (last==0) {
                printstring(s+("1"), 1, n-1);
                

                
            }
      
            
            return;




    }
    public static void main(String[] args) {
        int n = 5;
        String s = new String();
        
        printstring(s, 0,n);
        
        
        
    }
}
