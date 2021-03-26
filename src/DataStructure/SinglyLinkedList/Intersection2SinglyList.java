package DataStructure.SinglyLinkedList;

import java.util.HashSet;
import java.util.Set;

public class Intersection2SinglyList {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> seenNode = new HashSet<>();

        while (headA != null) {
            seenNode.add(headA);
            headA = headA.next;
        }

        while(headB != null){
            if(seenNode.contains(headB)) return headB;
            seenNode.add(headB);
            headB = headB.next;
        }

        return null;
    }


}
