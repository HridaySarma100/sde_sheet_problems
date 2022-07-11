public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 4, 7, 8, 10};
        int[] arr2 = {2, 3, 9};
        int[] mergedArr = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, mergedArr, 0, arr1.length);
        System.arraycopy(arr2, 0, mergedArr, arr1.length, arr2.length);
        PrintArray.printArr(mergedArr);
        merge(mergedArr);
        System.out.println();
        PrintArray.printArr(mergedArr);

    }

    private static void merge(int[] mergedArr) {
        int gap = mergedArr.length / 2;
        boolean gapIsNotOne = true;
        while (gapIsNotOne) {
            System.out.println(gap);
            for (int i = 0, j = gap; i < mergedArr.length && j < mergedArr.length; i++, j++) {
                if (mergedArr[i] > mergedArr[j]) {
                    int temp = mergedArr[j];
                    mergedArr[j] = mergedArr[i];
                    mergedArr[i] = temp;
                }
            }
            if (gap == 1) {
                gapIsNotOne = false;
            }
            gap = gap / 2;
        }
    }

}
