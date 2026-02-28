import java.lang.reflect.Array;
import java.util.Arrays;

import javax.management.openmbean.ArrayType;

public class spirel2 {
    public static void main(String[] args) {

        int n = 5 ;
        int matrix[][] = new int[n][n];
        
                    int startrow = 0;
                    int startcolm=0;
                    int endrow =matrix.length-1;
                    int endcolm = matrix[0].length-1;
                    int num = 1;
                    

                    while(startrow<=endrow && startcolm<=endcolm){

                        for (int i = startcolm; i <=endcolm; i++) {
                            matrix[startrow][i] = num;
                            num++;
                            
                        }
                        
                        for (int j = startrow+1; j <=endrow; j++) {
                            matrix[j][endcolm] = num;
                             num++;
                            
                        }
                        
                        for (int i = endcolm-1; i >=startcolm; i--) {
                            matrix[endrow][i] = num;
                             num++;
                            
                        }
                        for (int j = endrow-1; j >=startrow+1; j--) {
                            matrix[j][startrow] = num;
                            num++;
                            
                        }

                     startrow ++;
                     startcolm++;
                     endrow --;
                     endcolm --;


                       
                    }
                    for (int i = 0; i < matrix.length; i++) {
                        for (int j = 0; j < matrix.length; j++) {
                            System.out.print(matrix[i][j] + " ");
                            
                        }
                        System.out.println();
                    }
        
    }
}
