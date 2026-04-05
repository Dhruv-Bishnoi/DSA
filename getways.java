public class getways {
    public static void main(String[] args) {
        System.out.println(ways(0, 0, 3, 3));
        
    }
    public static int ways(int i , int j , int n ,int m){

        if (i == n-1 && j ==m-1) {
            return 1;
            
        }

        if (i==n || j ==m) {

            return 0;
            
        }

        int w1 = ways(i+1, j, n, m);
        int w2 = ways(i, j+1, n, m);

        int totalways = w1+w2;

        return totalways;

    }
}
