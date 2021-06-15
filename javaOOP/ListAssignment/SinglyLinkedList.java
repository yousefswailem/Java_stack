public class SinglyLinkedList {
    private Node head;

    public void add(int value){
        Node node = new Node(value);
        if(this.head == null){
            this.head = node;
        }else{
            Node temp = this.head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = node;
        }
    }
    public void remove(){
        Node temp = this.head;
        while(true){
            if(temp.next.next == null){
                break;
            }
            temp = temp.next;
        }
        temp.next = null;
    }
    public void printValues(){
        Node temp = this.head;
        while(temp.next != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
        System.out.println(temp.value);
    }
    
}