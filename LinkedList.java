public class LinkedList {
    public static Node Head;
    public static Node Tail;

    public static class  Node {
        int data;
        Node next;


        public Node(int data){

            this.data = data;
            this.next = null;

        }


        public void Firstadd(int data){


            Node newNode = new Node(data);

            if (Head==null) {
                Head = Tail = newNode;
                return;

                
            }
            newNode.next = Head;

            Head = newNode;
        }


        public void Lastadd(int data){



            Node newNode = new Node(data);
             if (Head==null) {
                Head = Tail = newNode;
                return;

                
            }

            Tail.next = newNode;
            Tail = newNode;

        }


        
    }
    public static void main(String[] args) {

        LinkedList ll = new LinkedList();
        
    }
}
