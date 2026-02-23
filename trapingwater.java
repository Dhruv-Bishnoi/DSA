public class trapingwater {
    public static void main(String[] args) {
        int bars[] = {4,2,0,6,3,2,5};
        int n = bars.length;
       int left_max[] = new int[n];
       int right_max[] = new int[n];

       left_max[0]=bars[0];
       for(int i = 1 ;i<n;i++){
        left_max[i]=Math.max(left_max[i-1], bars[i]);

       }

       right_max[n-1]=bars[n-1];
       for(int i =n-2;i>=0;i--){
        right_max[i]=Math.max(right_max[i+1], bars[i]);
       }

       int totalarea = 0;

       for(int i = 0 ; i<n-1;i++){
        totalarea+=(Math.min(right_max[i], left_max[i])-bars[i]);
       }

       System.out.println(totalarea);
    }
}
