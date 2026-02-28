public class diagonalsum {
    public static void main(String[] args) {
    int arr[][]={{1,2,3},
                {1,2,3},
                {1,2,3},};

            int sum = 0;

            for (int i = 0; i < arr.length; i++) {
                sum+=arr[i][i];

                if (i!=arr.length-1-i) {
                    sum+=arr[i][arr.length-1-i];
                    
                }

                
            }
            // int sec = 0;
            // int pri =0;
            // int prij =arr.length-1;
            // for (int i = 0; i < arr.length; i++) {
            //     for (int j = 0; j < arr.length; j++) {
            //         if (j==sec && i==sec) {
            //             sum+=arr[sec][sec];
            //             sec++;

                        
            //         }
            //         if (j==prij && i==pri) {
            //             if (j==i) {
            //                 sum-=arr[pri][prij];
                            
            //             }
            //             sum+=arr[pri][prij];
            //             pri++;
            //             prij--;
                        
            //         }


                    
            //     }
                
            // }



            System.out.println(sum);
    }
}
