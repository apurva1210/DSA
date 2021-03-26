package DataStructure.SinglyLinkedList;

//Remove all elements from a linked list of integers that have value val.
//Input:  1->2->6->3->4->5->6, val = 6
//Output: 1->2->3->4->5

public class RemoveLinkedListElement {


    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.addNode(6);
        singlyLinkedList.addNode(5);
        singlyLinkedList.addNode(6);
        singlyLinkedList.addNode(8);
        singlyLinkedList.addNode(9);
        singlyLinkedList.addNode(3);
        singlyLinkedList.addNode(6);

        singlyLinkedList.printList();

        RemoveLinkedListElement removeLinkedListElement = new RemoveLinkedListElement();
        ListNode head = removeLinkedListElement.removeElements(singlyLinkedList.head, 6);
        singlyLinkedList.head = head;
        singlyLinkedList.printList();

    }


    public ListNode removeElements(ListNode head, int val) {
        ListNode sentinel = new ListNode(0);
        sentinel.next = head;

        ListNode prev = sentinel, curr = head;
        while (curr != null) {
            if (curr.val == val) prev.next = curr.next;
            else prev = curr;
            curr = curr.next;
        }
        return sentinel.next;
    }


}

