package binarysearch;

public class InfiniteArraySearch {

    public static void main(String[] args) {
        InfiniteArraySearch.ans(0, 1, 66, new int[]{1, 2, 3, 5, 6, 7, 8, 9, 23, 44, 56, 66, 77, 88, 99, 123, 124, 234, 455, 667});
    }

    static void ans(int start, int end, int target, int[] a) {
        while (target > a[end]) {
            int temp = end + 1;
            end = end + 2 * (end - start + 1);
            start = temp;
        }
        int ans = new InfiniteArraySearch().find(a, target, start, end);
        System.out.println(ans);
    }

    public int find(int[] a, int target, int start, int end) {
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < a[mid]) {
                end = mid - 1;
            } else if (target > a[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                return ans;
            }
        }
        return ans;
    }
}
