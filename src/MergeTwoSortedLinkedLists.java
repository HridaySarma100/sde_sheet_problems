import Models.LinkedListGenerator;
import Models.ListNode;

public class MergeTwoSortedLinkedLists {

    public static void main(String[] args) {
        int[] arr = {5, 6, 7};
        int[] arr2 = {3, 4, 8, 10};
        ListNode l1 = new ListNode(arr[0]);
        ListNode l2 = new ListNode(arr2[0]);
        LinkedListGenerator.generate(arr2, l2);
        LinkedListGenerator.generate(arr, l1);
        ListNode ft = null;
        merge(l1,l2,ft);
        PrintingPress.printLinkedList(ft);

    }

    private static void merge(ListNode list1, ListNode list2,ListNode ft) {


    }


}
