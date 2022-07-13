package Models;

public class LinkedListGenerator {
    public static void generate(int[] arr,ListNode head){
        int n = 1;
        while (n <arr.length){
            head.next = new ListNode(arr[n]);
            head = head.next;
            n++;
        }

    }
}
