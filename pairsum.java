import java.util.ArrayList;

public class pairsum {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(4);
        arr.add(8);
        arr.add(3);
        arr.add(7);
        arr.add(1);
        arr.add(8);
        arr.add(6);
        arr.add(2);
        arr.add(5);

        int n = 0 ;
        int target = 10;
        int l = arr.size();
        



        for (int i = 0; i < arr.size(); i++) {

            if (arr.get(i)<arr.get(i+1)) {
                n = i;
                break;

                
            }
            
        }

        int left = n+1;
        int right = n ;


        while (left != right) {

            if (arr.get(left)+arr.get(right) == target) {

                System.out.println(target);
                break;

            
            }

            if (target>arr.get(left)+arr.get(right)) {
                left = (left + 1)%l;

            }
            else{
                right =(right-1+l)%l;
            }
            
        }
        
    }
    
}
