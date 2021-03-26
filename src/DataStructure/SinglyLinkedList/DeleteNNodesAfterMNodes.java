package DataStructure.SinglyLinkedList;

//Given the head of a linked list and two integers m and n.
// Traverse the linked list and remove some nodes in the following way:
//
//        Start with the head as the current node.
//        Keep the first m nodes starting with the current node.
//        Remove the next n nodes
//        Keep repeating steps 2 and 3 until you reach the end of the list.
//        Return the head of the modified list after removing the mentioned nodes.
//
//        Follow up question: How can you solve this problem by modifying the list in-place?

public class DeleteNNodesAfterMNodes {

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

        DeleteNNodesAfterMNodes deleteNNodesAfterMNodes = new DeleteNNodesAfterMNodes();
        ListNode head = deleteNNodesAfterMNodes.deleteNodes(singlyLinkedList.head, 2, 3);
        singlyLinkedList.head = head;

        singlyLinkedList.printList();
    }

    public ListNode deleteNodes(ListNode head, int m, int n) {
        ListNode currentNode = head;
        ListNode lastMNode = head;
        while (currentNode != null) {
            // initialize mCount to m and nCount to n
            int mCount = m, nCount = n;
            // traverse m nodes
            while (currentNode != null && mCount != 0) {
                lastMNode = currentNode;
                currentNode = currentNode.next;
                mCount--;
            }
            // traverse n nodes
            while (currentNode != null && nCount != 0) {
                currentNode = currentNode.next;
                nCount--;
            }
            // delete n nodes
            lastMNode.next = currentNode;
        }
        return head;
    }
}
