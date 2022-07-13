import Models.LinkedListGenerator;
import Models.ListNode;


public class RemoveNthNodeFromLL {

    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 4, 5, 6};
        ListNode head = new ListNode(arr[0]);
        LinkedListGenerator.generate(arr, head);
        PrintingPress.printLinkedList(remove(head,6));
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
            ListNode t = head;
            count = 1;
            while (t != null) {
                if (count == pos) {
                    if (t.next.next != null){
                        t.next = t.next.next;
                    }else {
                        t.next = null;
                    }

                    System.gc();
                }
                count++;
                t = t.next;
            }
        }
        return head;
    }


}
