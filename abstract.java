public class ABSTRACT{
public static void main(String[] args){
        dog s1 = new dog();
    }
}


    abstract class Animal{
        Animal(){
            System.out.println("constructor is called in animal");
        }

        abstract void leg();
    }
     class dog extends Animal {

        dog(){
            System.out.println("constructor is called in dog");
        }
        void leg(){
            System.out.println("4leg");
        }

    
         
    }
