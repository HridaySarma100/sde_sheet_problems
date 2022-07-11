public class Sort1s2s3s {

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 2, 2, 1, 0, 0, 1, 1, 0};
        System.out.println("Before");
        printArr(arr);
        sort(arr);
        System.out.println("After");
        printArr(arr);
    }

    private static void printArr(int[] arr) {
        for (int i :
                arr) {
            System.out.println(i);
        }
    }

    private static void sort(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;

        while (mid <= high) {
            int temp;
            switch (nums[mid]) {
                case 0:
                    temp = nums[mid];
                    nums[mid] = nums[low];
                    nums[low] = temp;
                    mid++;
                    low++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    temp = nums[mid];
                    nums[mid] = nums[high];
                    nums[high] = temp;
                    high--;
                    break;
            }
        }

    }

}
