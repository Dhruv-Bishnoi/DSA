public class binarysearch {

    public static void search_el(int arry[], int key) {

        int min = 0;
        int max = arry.length - 1;

        while (min <= max) {

            int mid = (min + max) / 2;

            if (arry[mid] == key) {
                System.out.println("Found element at index " + mid);
                return;
            }

            if (key < arry[mid]) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }

        System.out.println("Element not found");
    }

    public static void main(String[] args) {

        int arry[] = {1,2,3,4,5,6,7,8,9,11};
        int key = 8;

        search_el(arry, key);

    }
}
