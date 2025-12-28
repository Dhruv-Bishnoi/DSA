public class First_Missing_Positive {
    public static void main(String[] args) {
        int arr[] = { 3, 4, -1, 1 };
        int x = 1;

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    // System.out.println(arr[j]);
                    // System.out.println(arr[j + 1]);

                }
            }

        }
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
        
                if( i>0 &&  arr[j]!=i){
                    System.out.println(i);
                }


            }


        }

    }
}
