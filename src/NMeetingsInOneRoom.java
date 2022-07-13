public class NMeetingsInOneRoom {
    public static void main(String[] args) {
        int[] s = {1, 0, 3, 8, 5, 8};
        int[] e = {2, 6, 4, 9, 7, 9};
        int n = s.length;
        System.out.println(maxMeetings(s, e, n));
    }

    public static int maxMeetings(int start[], int end[], int n) {
        int count = 1, j, i;
        sort(end, start, 0, start.length - 1);


        for (i = 1, j = 0; i < n; ) {
            if (start[i] > end[j]) {
                j = i;
                ++count;
            }
            ++i;
        }
        return count;
    }

    static void sort(int arr[], int arr2[], int l, int r) {
        if (l < r) {
            // Find the middle point
            int m = l + (r - l) / 2;

            // Sort first and second halves
            sort(arr, arr2, l, m);
            sort(arr, arr2, m + 1, r);

            // Merge the sorted halves
            merge(arr, arr2, l, m, r);
        }
    }

    static void merge(int[] arr, int[] arr2, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
        int[] L = new int[n1];
        int[] L2 = new int[n1];
        int[] R = new int[n2];
        int[] R2 = new int[n2];

        for (int i = 0; i < n1; ++i) {
            L[i] = arr[l + i];
            L2[i] = arr2[l + i];
        }
        for (int j = 0; j < n2; ++j) {
            R[j] = arr[m + 1 + j];
            R2[j] = arr2[m + 1 + j];
        }

        int i = 0, j = 0;

        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                arr2[k] = L2[i];

                i++;
            } else {
                arr[k] = R[j];
                arr2[k] = R2[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            arr2[k] = L2[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            arr2[k] = R2[j];
            j++;
            k++;
        }
    }

}
