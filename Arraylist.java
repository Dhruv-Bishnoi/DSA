import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(34);
        list.add(324);
        list.add(334);
        list.add(344);
        list.add(325);
        list.add(314);
        list.add(394);
        list.get(1);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);


        
    }
}