public class Non_Decreasing_Array {
    public static void main(String[] args) {

        int[] arr = {3, 4, 2, 3};
        int count = 0;

        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] > arr[i + 1]) {
                count++;

                if (count > 1) {
                    System.out.println(false);
                    return;
                }

                if (i > 0 && arr[i - 1] > arr[i + 1]) {
                    arr[i + 1] = arr[i];  
                } else {
                    arr[i] = arr[i + 1];   
                }
            }
        }

        System.out.println(true);
    }
}
