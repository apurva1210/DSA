package DataStructure.SinglyLinkedList;

public class PalindromeList {

    public boolean isPalindrome(ListNode head) {
        return true;
    }

    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.addNode(4);
        singlyLinkedList.addNode(5);
        singlyLinkedList.addNode(8);
        singlyLinkedList.addNode(9);
        singlyLinkedList.printList();

        PalindromeList palindromeList = new PalindromeList();
        palindromeList.isPalindrome(singlyLinkedList.head);
    }
}
