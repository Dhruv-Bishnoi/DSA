public class spirel {
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4,0},
                        {5,6,7,8,0},
                        {9,10,11,12,0},
                        {13,14,15,16,0}};


                    int startrow = 0;
                    int startcolm=0;
                    int endrow =matrix.length-1;
                    int endcolm = matrix[0].length-1;

                    while(startrow<=endrow && startcolm<=endcolm){

                        for (int i = startrow; i <=endrow; i++) {
                            System.out.println(matrix[startrow][i]);
                            
                        }
                        
                        for (int j = startcolm+1; j <endcolm; j++) {
                            System.out.println(matrix[j][endcolm]);
                            
                        }
                        
                        for (int i = endcolm; i >=startcolm; i--) {
                            System.out.println(matrix[endrow][i]);
                            
                        }
                        for (int j = endrow-1; j >startrow; j--) {
                            System.out.println(matrix[j][startrow]);
                            
                        }

                     startrow ++;
                     startcolm++;
                     endrow --;
                     endcolm --;


                       
                    }


    }
}
