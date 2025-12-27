
public class secLarge {
    public static void main(String[] args) {

        int largest = Integer.MIN_VALUE;
        int secLarge = Integer.MIN_VALUE;

        int[] arr = { 5, 1, 6, 4, 9, 3, 7 };

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] >= largest) {
                secLarge = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > secLarge) {

                secLarge = arr[i];

            }
        }
        if (secLarge == Integer.MIN_VALUE) {
            System.out.println("Second largest element does not exist, all elements are same");

            System.out.println(largest);
        } else {
            System.out.println(secLarge);
        }


    }
}