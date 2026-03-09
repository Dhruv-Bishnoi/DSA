
public class inharitance {

     public static void main(String[] args) {

        fish shark = new fish();
        shark.eat();
          
     }
    }
     class animal {
        void eat(){
            System.out.println("animal eats");

        }

        void run(){
            System.out.println("animal run ");

        }

     
        
     }
     class fish extends animal {
        void swim(){
            System.out.println("fish swim");
        }
     
        
     }
