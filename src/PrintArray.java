public class PrintArray {
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
}
