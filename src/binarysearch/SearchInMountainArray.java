package binarysearch;

public class SearchInMountainArray {
    public static void main(String[] args) {
//        new SearchInMountainArray().findInMountainArray(3, new MountainArray());
    }

    public int findInMountainArray(int target, MountainArray mountainArr) {
        // find the peak of the array
        // break the mountainArr into 2
        // do binary search in both the arrays
        // return the lowest of the results

        int ans = -1;
        int peakIndex = SearchInMountainArray.peakIndexInMountainArray(mountainArr);

        // No need to do any search if we are looking for the peak element
        if (target == mountainArr.get(peakIndex)) {
            return peakIndex;
        }

        int length = mountainArr.length();
        int[] test = new int[peakIndex + 1];
        int[] test2 = new int[length - peakIndex + 1];
        for (int i = 0; i < peakIndex; i++) {
            test[i] = mountainArr.get(i);
        }
        int k = 0;
        for (int i = peakIndex; i < length - 1; i++) {
            test2[k] = mountainArr.get(i);
            k++;
        }

        int ans1 = SearchInMountainArray.bin(test, target);
        int ans2 = SearchInMountainArray.bin(test2, target);

        if (ans1 == -1 && ans2 == -1)
            return -1;
        else if (ans1 != -1 && ans2 != -1)
            return Math.min(ans1, ans2);
        else if (ans1 == -1)
            ans = ans2;
        else
            ans = ans1;
        return ans;
    }

    /**
     * Gives the index of the peak element in the mountain array
     *
     * @param arr
     * @return
     */
    public static int peakIndexInMountainArray(MountainArray arr) {
        int start = 0;
        int end = arr.length() - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr.get(mid) > arr.get(mid + 1)) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        // In the end, start and end will have the same index
        // which is the peak element

        return end; // or return start since they are the same
        // returning index
    }

    /**
     * Binary search algo
     *
     * @param a
     * @param target
     * @return
     */
    public static int bin(int[] a, int target) {
        int ans = -1;

        int start = 0;
        int end = a.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (a[mid] < target) {
                start = mid + 1;
            } else if (a[mid] > target) {
                end = mid - 1;
            }
            ans = mid;
        }

        return ans; // returning index
    }

    class MountainArray {
        int[] arr = new int[]{1, 2, 3, 4, 5, 3, 1};

        public int length() {
            return arr.length;
        }

        public int get(int index) {
            return arr[index];
        }
    }
}