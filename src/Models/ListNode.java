package Models;

public class ListNode {
    public  ListNode next;
    public  int val;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }


    public ListNode(ListNode next, int val) {
        this.next = next;
        this.val = val;
    }
}
