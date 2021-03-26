package DataStructure.SinglyLinkedList;

public class SinglyLinkedList {


    public ListNode head;

    public void addNode(int data){
        //if the list is empty
        if(head == null){
            head = new ListNode(data);
        }else {
            //if the list is not empty
            ListNode newListNode = new ListNode(data);
            newListNode.next = head;
            head = newListNode;
        }
    }

    public void printList(){
        ListNode listNode = head;
        while(listNode != null){
            System.out.print(listNode.val);
            listNode = listNode.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SinglyLinkedList linkedList = new SinglyLinkedList();
        linkedList.addNode(2);
        linkedList.addNode(5);
        linkedList.addNode(6);
        linkedList.printList();
    }
}



