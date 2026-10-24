//ye class ek linked list ka structure define krta h jismai hum head mai data insert kr skte h
public class InsertAtHead{

    //ye specific ek node(Box) ka structure define krta h jismai data and next ka address store hoga
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    //constructor
    public InsertAtHead(){
        this.size = 0;
        this.head = null;
        this.tail = null;
    }

    // insert at head function
    public void insertAtHead(int data){
        Node newNode = new Node(data);
        if(head ==null || tail == null){
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    // display function
    public void display(){
        Node current = head;
        while(current != null){
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        InsertAtHead list = new InsertAtHead();
        list.insertAtHead(10);
        list.insertAtHead(20);
        list.insertAtHead(30);

        list.display(); // Output: 30 -> 20 -> 10 -> null
        
    }
}