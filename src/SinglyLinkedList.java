public class SinglyLinkedList {

    private Node head;

    public void insertNode(int data){
        //if list is empty
        if(this.head == null){
            this.head = new Node(data);
        }else{
            //if list is not empty
            Node newNode = new Node(data);
            newNode.setNextNode(this.head);
            this.head = newNode;
        }
    }

    public void deleteNode(){

    }

    public void printLinkedList(){
            Node node = head;
            while(node!= null){
                System.out.println(node.getData());
                node = node.getNextNode();
            }
    }

    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.insertNode(4);
        singlyLinkedList.insertNode(5);
        singlyLinkedList.insertNode(6);
        singlyLinkedList.printLinkedList();
    }

    class Node{
        private Node nextNode;
        private int data;

        public Node(int data) {
            this.data = data;
        }

        public void setNextNode(Node nextNode) {
            this.nextNode = nextNode;
        }

        public Node getNextNode() {
            return nextNode;
        }

        public int getData() {
            return data;
        }
    }
}


