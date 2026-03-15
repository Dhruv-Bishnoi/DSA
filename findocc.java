public class findocc {
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


    public static void intToEng(int i ,String arr[]){
        if (i==0) {
            return
            ;
        }

        int lastdigit = i%10;

        
        intToEng(i/10, arr);
        System.out.println(arr[lastdigit]);
        return;
        

        
    }
    public static void main(String[] args){

        int  key = 2;
        String arr[] = {"zero","one","two","three","four","five","six","seven","eight","nine"};

        intToEng(193,arr);

    }
    }

