public class SinglyLinkedList {

    private Node head;

    public void addNode(int data){
        //if the list is empty
        if(head == null){
            head = new Node(data);
        }else {
            //if the list is not empty
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }
    }

    public void printList(){
        Node node = head;
        while(node!= null){
            System.out.println(node.data);
            node = node.next;
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList linkedList = new SinglyLinkedList();
        linkedList.addNode(2);
        linkedList.addNode(5);
        linkedList.addNode(6);
        linkedList.printList();
    }

    class Node{
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }
    }
}


