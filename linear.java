public class linear {

    public static void linearsearch(int arry[] , int key){

        for(int i = 0;i<arry.length;i++){
            if(arry[i]==key){
                System.out.println("element found at "+ i+ " index");
                return;
            }

        }
        System.out.println("element not found");
    }

    public static void main(String[] args) {
        
        int arry[]= {10,2,6,34,8,2,4,6,9,5};
        int key = 33;
        linearsearch(arry, key);
    }
}