package DataStructure.SinglyLinkedList;

public class ReverseList {

    public ListNode reverseList(ListNode head) {
        ListNode prevListNode = null;
        ListNode currListNode = head;
        while(currListNode !=null){
            ListNode nextListNode = currListNode.next;
            currListNode.next = prevListNode;
            prevListNode = currListNode;
            currListNode = nextListNode;
        }
        return prevListNode;

    }


    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.addNode(3);
        singlyLinkedList.addNode(5);
        singlyLinkedList.addNode(6);
        singlyLinkedList.addNode(8);
        singlyLinkedList.printList();

        ReverseList reverseList = new ReverseList();
        ListNode newHead = reverseList.reverseList(singlyLinkedList.head);
        singlyLinkedList.head = newHead;
        singlyLinkedList.printList();
    }
}
