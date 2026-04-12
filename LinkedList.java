public class LinkedList {
    public static Node Head;
    public static Node Tail;
    public static int size;

    public static class  Node {
        int data;
        Node next;


        public Node(int data){

            this.data = data;
            this.next = null;

        }


        
    }
    public void Firstadd(int data){


        Node newNode = new Node(data);
        size++;

        if (Head==null) {
            Head = Tail = newNode;
            return;

            
        }
        newNode.next = Head;

        Head = newNode;
    }


    public void Lastadd(int data){



        Node newNode = new Node(data);
                size++;

         if (Head==null) {
            Head = Tail = newNode;
            return;

            
        }

        Tail.next = newNode;
        Tail = newNode;

    }


    public void printNode(){
         if (Head == null) {
            System.out.println("empty");
            return ;
         }
        Node temp = Head ; 

        while(temp != null) {

            System.err.print(temp.data + " ");
            temp = temp.next;

            
        } 
        System.err.println();  
    }

    public void add(int index , int data){
        if (index == 0 ) {
            Firstadd(data);
            return;
        }

        Node newNode = new Node(data);
                size++;
 
        int i = 0 ;

        Node temp = Head;

        while (i<index-1) {
            temp = temp.next;
            i++;
            
        }

        newNode.next = temp.next;
        temp.next=newNode;
    }
    
    public int removeFirst(){
        if (size == 0) {

            return Integer.MIN_VALUE;
            
        }
        else if (size == 1) {
            int val =  Head.data;
            Tail = Head = null;
            size--;
            return val;
        }

        int val = Head.data;
        
        Head = Head.next;
        size--;

        return val;

    }
    public int removeLast(){
        if (size == 0) {

            return Integer.MIN_VALUE;
            
        }
        else if (size == 1) {
            int val =  Head.data;
            Tail = Head = null;
            return val;
        }

        Node temp = Head;
        int i = 0;

        while (i < size-2) {
            temp = temp.next;
            i++;

        }
        int val = temp.data;
        temp.next = null;
        Tail = temp;
        size--;
        return val;


    }


    public int  helper( Node Head , int key){

        if (Head == null) {

            return -1;
            
        }

        if (Head.data == key) {

            return 0 ;
            
        }

        int idx = helper(Head.next, key);

        if (idx == -1) {

            return -1;
            
        }

        return idx+1;
    }

    public int searchbyrecursion(int key){

        return helper(Head, key);
    }
    
    public void search(int key){

        Node temp = Head;
        int i = 0;

        while (temp != null) {

            if (temp.data == key) {
                System.out.println(i);
                return ;
                
            }

            temp = temp.next;
            i++;
            
        }

        System.out.println("not found");
    }
    public static void main(String[] args) {

        LinkedList ll = new LinkedList();
        ll.Firstadd(34); 
        ll.Firstadd(5);       
        ll.Lastadd(54);
        ll.printNode();
        ll.add(1, 65);
        ll.printNode();
        ll.removeFirst();
        ll.printNode();
        ll.removeLast();
        ll.printNode();
        System.out.println(ll.searchbyrecursion(34));




    }
}
