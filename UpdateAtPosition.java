public class UpdateAtPosition {
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
    public  void  UpdateAtPosition(){
        this.size = 0;
        this.head = null;
        this.tail = null;
    }
    private void insertAtHead(int data){
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
    private int updateAtPos(int Position , int data){
        if(Position<1 || Position>size){
            return -1; // Invalid position
        }
        Node temp=head;
        for(int i=1;i<Position;i++){
            temp=temp.next;
        }
        temp.data=data;
        return 0; // Update successful
    }
    private void Display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        UpdateAtPosition list = new UpdateAtPosition();
        list.insertAtHead(10);
        list.insertAtHead(20);
        list.insertAtHead(30);
        System.out.println(list.updateAtPos(2, 25)); // Output: 0 (update successful)
        list.Display(); // Output: 30 -> 25 -> 10 -> null
        System.out.println(list.updateAtPos(1, 35)); // Output: 0 (update successful)
        list.Display(); // Output: 35 -> 25 -> 10 -> null
        System.out.println(list.updateAtPos(3, 15)); // Output: 0 (update successful)
        list.Display(); // Output: 35 -> 25 ->
        System.out.println(list.updateAtPos(4, 40)); // Output: -1 (invalid position)
        list.Display(); // Output: 35 -> 25 -> 15 -> null
        
    }
}
