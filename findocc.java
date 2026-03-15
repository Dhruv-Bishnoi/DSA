public class findocc {
    static String arr[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};
    public static void find(int key ,int arr[],int i ){

        if (i>arr.length-1) {
            return;
            
        }

        if (arr[i]==key) {
            System.out.println(i);


        }

        find(key, arr, i+1);
        return;
    }


    public static void intToEng(int i ){
        if (i==0) {
            return
            ;
        }

        int lastdigit = i%10;

        
        intToEng(i/10);
        System.out.println(arr[lastdigit]);
        return;
        

        
    }
    public static void main(String[] args){

        int  key = 2;

        intToEng(193);

    }
    }

