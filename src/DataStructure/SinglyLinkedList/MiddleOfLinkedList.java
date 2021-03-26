package DataStructure.SinglyLinkedList;

public class MiddleOfLinkedList {

    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.addNode(4);
        singlyLinkedList.addNode(9);
        singlyLinkedList.addNode(3);
        singlyLinkedList.addNode(8);
        singlyLinkedList.addNode(6);

        singlyLinkedList.printList();

        MiddleOfLinkedList middleOfLinkedList = new MiddleOfLinkedList();
        ListNode listNode = middleOfLinkedList.middleNode(singlyLinkedList.head);

        System.out.println(listNode.val);

    }

    /**
     * if even no is present and there are 2 middle nos then to return the 2nd middle us middleNode method
     * to return 1st use middleNode2 method
     *
     */

    public ListNode middleNode(ListNode head) {

        ListNode slow = head, fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }


    public ListNode middleNode2(ListNode head) {

        ListNode fast = head;
        ListNode slow = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
