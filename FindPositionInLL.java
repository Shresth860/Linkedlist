public class FindPositionInLL {

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
    public void FindPositionInLL(){
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

    private int findPosition(int key){
        int count=1;
        Node temp=head;
        while(temp!=null){
            if(temp.data==key){
                return count;
            }
            count++;
            temp = temp.next;
        }
        return -1; // Key not found
    }
    public static void main(String[] args) {
        FindPositionInLL list = new FindPositionInLL();
        list.insertAtHead(10);
        list.insertAtHead(20);
        list.insertAtHead(30);
        System.out.println(list.findPosition(10)); // Output: 3
        System.out.println(list.findPosition(20)); // Output: 2
        System.out.println(list.findPosition(30)); // Output: 1
        System.out.println(list.findPosition(40)); // Output: -1 (not found)

        
    }
}
