import Models.ListNode;

public class IntersectionPointOfTwoLinkedList {

    public static void main(String[] args) {

    }

    public ListNode getInttersectionNode(ListNode headA,ListNode headB){
        ListNode dumm1 = headA;
        ListNode dumm2 = headB;

        while (dumm1 != null && dumm2 != null){
            dumm1 = dumm1.next;
            dumm2 = dumm2.next;
        }
        dumm1 = headB;
        while (dumm1 != null && dumm2 != null){
            dumm1 = dumm1.next;
            dumm2 = dumm2.next;
        }
        dumm2 = headA;
        while (dumm1 != null && dumm2 != null){
            if (dumm1 == dumm2)return dumm1;
            dumm1 = dumm1.next;
            dumm2 = dumm2.next;
        }
        return null;
    }
}
