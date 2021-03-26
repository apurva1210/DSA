package DataStructure.SinglyLinkedList;

public class OddEvenLinkedList {

    //wrong

    public ListNode oddEvenList(ListNode head) {
        //if list is empty or has 1 element
        if(head == null || head.next == null)
            return head;

        ListNode currNode = head;
        ListNode evenHead = null;
        ListNode evenNode= null;
        ListNode lastOddNode = null;


        while (currNode.next != null){
            if(evenHead == null){
                evenHead = currNode.next;
                evenNode = currNode.next;
            }else{
                evenNode.next = currNode.next;
                evenNode = evenNode.next;
            }
            currNode.next = currNode.next.next;

            currNode = currNode.next;

            if(currNode.next == null){
                lastOddNode = currNode;
            }


        }

        lastOddNode.next = evenHead;

     return head;
    }

    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.addNode(5);
        singlyLinkedList.addNode(4);
        singlyLinkedList.addNode(3);
        singlyLinkedList.addNode(2);
        singlyLinkedList.addNode(1);

        singlyLinkedList.printList();

        OddEvenLinkedList oddEvenLinkedList = new OddEvenLinkedList();
        ListNode newHead = oddEvenLinkedList.oddEvenList(singlyLinkedList.head);
        singlyLinkedList.head = newHead;
        singlyLinkedList.printList();
    }
}
