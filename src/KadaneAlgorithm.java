public class KadaneAlgorithm {
    public static void main(String[] args) {
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println(maxSubArray(arr));
    }

    private static int maxSubArray(int[] arr) {
        int i = 0;
        int sum = 0, largest = 0;
        while (i < arr.length) {
            sum += arr[i];
            if (sum > largest) largest = sum;
            if (sum < 0) sum = 0;
            i++;
        }
        return largest;
    }

}
