import java.util.*;
public class ContainerWater {

    public static void WaterInCan(ArrayList<Integer> container ){

        int max = Integer.MIN_VALUE;
        int left = 0 ;
        int right = container.size()-1;
        





        

        while (left<right) {
            
        
                int width = right-left;
                int height = Math.min(container.get(left),container.get(right));

                max = Math.max(max, height*width);
                if (container.get(left)>container.get(right)) {
                    right--;

                    
                }
                else{
                    left++;
                }





                
            
        }
        System.out.println(max);
    }
    public static void main(String[] args) {
        ArrayList<Integer> container = new ArrayList<>();
        container.add(1);
        container.add(8);
        container.add(6);
        container.add(2);
        container.add(5);
        container.add(4);
        container.add(8);
        container.add(3);
        container.add(7);

        WaterInCan(container);
    }
}