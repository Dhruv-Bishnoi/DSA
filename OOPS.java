
public class OOPS {

    public static void main(String[] args) {

        pen p1 = new pen();
        p1.setcolor("red");
        System.out.println(p1.color);
        p1.pin = 5;
        
        System.out.println(p1.pin);
        
        
    }
}

class pen {

    String color;
    int pin ;

    void setcolor(String newcolor ){
    color = newcolor;
}

    void setpin( int newpin){
    pin= newpin;
}




    
}