public class transpose {

    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 5 },
                { 3, 4, 6 } };
        int newarr[][] = new int[arr[0].length][arr.length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {

                newarr[j][i] = arr[i][j];

            }

        }
        for (int i = 0; i < newarr.length; i++) {
            for (int j = 0; j < newarr[0].length; j++) {
                System.out.print(newarr[i][j] + " ");
            }
            System.out.println();

        }
    }
}
