public class MinimumPlatforms {
    public static void main(String[] args) {
        int[] s = {900, 940, 950, 1100, 1500, 1800};
        int[] e = {910, 1200, 1120, 1130, 1900, 2000};
        System.out.println(minimumPlatform(s, e, s.length));
    }

    private static int minimumPlatform(int[] arr, int[] dep, int n) {
        sort(arr, 0, arr.length - 1);
        sort(dep, 0, dep.length - 1);
        PrintingPress.printArr(arr);
        System.out.println();
        PrintingPress.printArr(dep);
        int max = 0;
        int platformCount = 0;
        int currentOccupiedPlatform;
        int currentTrain = 0;
        for (int i = 0; i < n; i++) {
            currentOccupiedPlatform = dep[i];
            for (int j = currentTrain; j < n; j++) {

                if (arr[j] <= currentOccupiedPlatform) {
                    platformCount++;
                    if (max < platformCount) max = platformCount;
                } else {
                    platformCount--;
                    currentTrain = j;
                    break;
                }
            }
        }
        return max;
    }

//    private static int minimumPlatformz(int[] arr, int[] dep, int n) {
//        sort(arr, 0, arr.length - 1);
//        sort(dep, 0, dep.length - 1);
//        int max_platform = 0;
//        int platformCount = 0;
//        int current_occupied_platform = dep[0];
//        int currentTrain = 0;
//        for (int i = 0; i < n; i++) {
//            for (int j = currentTrain; j < n; j++) {
//                if (arr[j] <= current_occupied_platform) {
//                    platformCount++;
//                    if (max_platform < platformCount) max_platform = platformCount;
//                } else {
//                    platformCount--;
//                    currentTrain = j;
//                    break;
//                }
//            }
//            current_occupied_platform = arr[i];
//        }
//        return max_platform;
//    }

    static void sort(int arr[], int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2;
            sort(arr, l, m);
            sort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    static void merge(int[] arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
        int[] L = new int[n1];
        int[] L2 = new int[n1];
        int[] R = new int[n2];
        int[] R2 = new int[n2];

        for (int i = 0; i < n1; ++i) {
            L[i] = arr[l + i];
        }
        for (int j = 0; j < n2; ++j) {
            R[j] = arr[m + 1 + j];
        }

        int i = 0, j = 0;

        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];

                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}
