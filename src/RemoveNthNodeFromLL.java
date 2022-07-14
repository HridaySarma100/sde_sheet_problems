import Models.LinkedListGenerator;
import Models.ListNode;

import java.util.List;


public class RemoveNthNodeFromLL {

    public static void main(String[] args) {
        int[] arr = {1,2};
        ListNode head = new ListNode(arr[0]);
        LinkedListGenerator.generate(arr, head);
        PrintingPress.printLinkedList(optimizedRemove(head, 2));
    }

    private static ListNode optimizedRemove(ListNode head, int n) {
        if (head == null || head.next == null) return null;
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode fastPointer = dummy;
        ListNode slowPointer = dummy;
        while (n--!=0){
            fastPointer = fastPointer.next;
        }
        while (fastPointer.next != null){
            fastPointer = fastPointer.next;
            slowPointer = slowPointer.next;
        }
        slowPointer.next = slowPointer.next.next;
                
        return dummy.next;
    }

    private static ListNode remove(ListNode head, int n) {
        if (head == null) return null;
        ListNode dummy = head;
        int count = 0;
        while (dummy != null) {
            count++;
            dummy = dummy.next;
        }
        if (count == n) {
            ListNode deletableNode = head;
            deletableNode = null;
            head = head.next;
            System.gc();

        } else {
            int pos = count - n;
            count = 1;
            while (head != null) {
                if (count == pos) {
                    if (head.next.next != null) {
                        head.next = head.next.next;
                    } else {
                        head.next = null;
                    }

                    System.gc();
                }
                count++;
                head = head.next;
            }
        }
        return head;
    }


}
