public class Rotate_arry {
    public static void main(String[] args) {
        int arry[] = {1,4,6,3,8,5};
        int k = 3;
        int l = arry.length;
        int uparry[]= new int[l];
        int n = 0;

        for(int i = l-k;i<arry.length;i++){
            uparry[n]=arry[i];
            n++;
            System.out.println(arry[i]);
        }
        for(int i = 0 ; i <l-k;i++){
            uparry[n]=arry[i];
            n++;
            System.out.println(arry[i]);

        }
    }
}