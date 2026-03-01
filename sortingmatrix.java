public class sortingmatrix {
    public static void main(String[] args) {
        int matrix[][] ={{ 1, 3}};

        int target = 3;
        int currJ = matrix[0].length-1;
        int currI =0;

                         while (currI<matrix.length && currJ>=0) {
                            if (target==matrix[currI][currJ]) {

                                System.out.println(" element found at :" + currI + "," + currJ);
                                return;
                                }

                            if (target>matrix[currI][currJ]) {
                                currI++;
                            }
                            else  {
                                currJ--;
                                
                            }



                            
                            
                         }
                         System.out.println("notfound");




    }
}
