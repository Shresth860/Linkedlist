public class InsertAtTail {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    int size;
    Node head;
    Node tail;

    public InsertAtTail() {
        this.size = 0;
        this.head = null;
        this.tail = null;
    }

    private void insertAtTail(int data) {
        Node newNode = new Node(data);
        if (head == null || tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }
    

    private void insertAtPosition(int Position , int data){
        //head and tail ke liye already insertAtHead and insertAtTail function bana diye h
        //ye function linked list ke beech me kisi bhi position pe element insert krne ke

        if(Position==1){
            // insertAtHead(data);
            return;
        }
        if(Position==size+1){
            insertAtTail(data);
            return;
        }
        Node prevNode = head;
        for(int i =1 ;i<Position-2;i++){
            prevNode = prevNode.next;
        }
        Node newNode = new Node(data);
        newNode.next = prevNode.next;
        prevNode.next = newNode;
        size++;
    }

    private void display() {

        //ye function linked list ke sare elements ko display krta h
        // temp ek temporary variable hai jiski help se hum linked list ke sare elements ko traverse krke print kr skte h
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data + " -> ");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        InsertAtTail node = new InsertAtTail();
        node.insertAtTail(10);
        node.insertAtTail(20);
        node.insertAtTail(30);      

        node.insertAtPosition(2, 0);

        node.display(); // Output: 10 -> 20 -> 30 -> null
    }
}
