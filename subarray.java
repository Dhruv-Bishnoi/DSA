public class subarray {
    public static void main(String[] args) {
        int arry[] = { 1, 2, 3, 4, 5 };
        int ts = 0;
        int sumofarrry = 0;
        int min_sum = Integer.MAX_VALUE;
        int max_sum = Integer.MIN_VALUE;

        for (int k = 0; k < arry.length; k++) {

            for (int i = k; i < arry.length; i++) {
                for (int j = k; j <= i; j++) {
                    System.out.print(arry[j]);
                    sumofarrry += arry[j];
                }
                System.out.print(" = " + sumofarrry);
                if (sumofarrry < min_sum) {
                    min_sum = sumofarrry;
                }

                if (sumofarrry > max_sum) {
                    max_sum = sumofarrry;
                }

                sumofarrry = 0;
                System.out.print("  ");
                ts++;
            }
            System.out.println();
        }
        System.out.println("total subarray " + ts);
        System.out.println("largest sum of array is " + max_sum);
        System.out.println("smallest sum of array is " + min_sum);

    }
}
