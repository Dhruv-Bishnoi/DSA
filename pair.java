public class pair {

    public static void main(String[] args) {
        int arry[]={1,2,3,4,5,6,7};

        for(int i =0 ; i<arry.length;i++){
            for(int j = i+1;j<arry.length;j++){
                System.out.print("(" + arry[i] + "," + arry[j] + ")");
            }
            System.out.println();
        }
    }
}