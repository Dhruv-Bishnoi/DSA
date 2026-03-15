public class friendpair {

    public static int pair(int n){

        if(n == 0 || n == 1){
            return 1;
        }

        int single = pair(n-1);

        int pair = (n-1) * pair(n-2);

        return single + pair;
    }

    public static void main(String[] args){
        System.out.println(pair(3));
    }

}
