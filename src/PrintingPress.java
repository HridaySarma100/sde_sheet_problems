import Models.ListNode;

public class PrintingPress {
    public static void printArr(int[] arr) {
        for (int i :
                arr) {
            System.out.print(i + " , ");
        }
    }

    public static void print2DArr(int[][] arr) {
        for (int[] i :
                arr) {
            System.out.println(" [ ");
            for (int j :
                    i) {

                System.out.print(j);
            }
            System.out.println(" ] ");
        }
    }

    public static void printLinkedList(ListNode head) {
        while (head != null){
            System.out.println(head.val);
            head = head.next;
        }
    }
}
