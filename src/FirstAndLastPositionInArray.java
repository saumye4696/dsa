public class FirstAndLastPositionInArray {
    public int[] searchRange() {
        int[] ans = {-1, -1};
        
        
        
        
        return ans;
    }    
    
    
    public int search(int[] nums, int target, boolean findFirstIndex) {
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid -1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if (findFirstIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;

    }
}
