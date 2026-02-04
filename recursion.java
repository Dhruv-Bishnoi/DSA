public class recursion {
    public static void func(int n){
        if(n <= 5){
            System.out.println(n);
            func(n+1);
            

        }



    }
    public static void main(String[] args) {
        int n = 1;
        
    func(n);            
        
        }
    
}
