package binarysearch;

public class BinarySearch {
    public static void main(String[] args) {
        // int[] arr = new int[] { 1, 2, 3, 5, 7, 9, 49, 67 };
        char[] a = new char[]{'x', 'x', 'y', 'y'};
        System.out.println(bin(a, 'z'));

    }

    public static int bin(char[] a, int target) {
        int l = a.length;
        int mid = l / 2;
        int ans = -1;
        int temp = 0;
        int low = 0, high = a.length - 1;
        while (mid <= high) {
            if (a[mid] == target) {
                ans = mid;
                break;
            }
            if (a[mid] < target) {
                low = mid + 1;
            } else if (a[mid] > target) {
                high = mid - 1;
            }

            mid = low + (high - low) / 2;
            ans = a[mid];
        }

        return ans;


        // int l = a.length;
        // int s = 0;
        // int e = a.length - 1;
        // int m = s + (e - s) / 2;
        // char ans = 'a';
        // while (m <= e) {
        //     if (a[m] == target) {
        //         ans = a[m];
        //     }
        //     if ((int) a[m] < (int) target) {
        //         s = m + 1;
        //     } else if ((int) a[m] > (int) target) {
        //         e = m - 1;
        //     }
        //     m = s + (e - s) / 2;
        //     if (m >= a.length) {
        //         return a[0];
        //     }
        //     ans = a[m];
        // }
        // return (char) ans;


//        int start = 0;
//        int end = nums.length - 1;
//
//        while (start <= end) {
//            int mid = start + (end - start) / 2;
//            if (target < nums[mid]) {
//                end = mid -1;
//            } else if (target > nums[mid]) {
//                start = mid + 1;
//            } else {
//                ans = mid;
//                if ()
//            }
//        }
    }

}