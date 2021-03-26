package DataStructure.SinglyLinkedList;

//Write a function to delete a node in a singly-linked list.
// You will not be given access to the head of the list,
// instead you will be given access to the node to be deleted directly.
//
// It is guaranteed that the node to be deleted is not a tail node in the list.

public class DeleteNode {

    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.addNode(4);
        singlyLinkedList.addNode(5);
        singlyLinkedList.addNode(6);
        singlyLinkedList.addNode(8);
        singlyLinkedList.addNode(9);

        singlyLinkedList.printList();

        DeleteNode deleteNode = new DeleteNode();
        deleteNode.deleteNode(singlyLinkedList.head.next.next);

        singlyLinkedList.printList();
    }


    public void deleteNode(ListNode listNode) {
        listNode.val = listNode.next.val;
        listNode.next = listNode.next.next;
    }
}
