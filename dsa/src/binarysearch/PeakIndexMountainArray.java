package binarysearch;

public class PeakIndexMountainArray {
    public static void main(String[] args) {
        int ans = PeakIndexMountainArray.peakIndexInMountainArray(new int[]{0, 2, 6, 1, 0});
        System.out.println(ans);
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        // In the end, start and end will have the same index
        // which is the peak element

        return end; // or return start since they are the same
    }

    public static int peakIndexBruteForce(int[] a) {
        int ans = -1;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] < a[i + 1]) {
                ans = a[i + 1];
            }
        }
        return ans;
    }
}
