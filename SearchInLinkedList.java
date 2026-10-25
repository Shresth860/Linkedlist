public class SearchInLinkedList {

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
    public void SearchInLinkedList(){
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
   
    public boolean Search(int key){
         Node temp=head;
        while(temp!=null){
            if(temp.data==key){
                return true;
            }
            temp=temp.next;
        }
        return false;
    }
    public static void main(String[] args) {
        SearchInLinkedList list = new SearchInLinkedList();
        list.insertAtHead(10);
        list.insertAtHead(20);
        list.insertAtHead(30);
        System.out.println(list.Search(10));
        System.out.println(list.Search(20));
        System.out.println(list.Search(30));
        System.out.println(list.Search(40));
    }
    
}
