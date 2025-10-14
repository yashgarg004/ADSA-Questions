class Solution {
    public int[] searchRange(int[] nums, int target) {
        return new int[] { bound(nums, target, true), bound(nums, target, false) };
    }

    private int bound(int[] nums, int target, boolean first) {
        int low = 0, high = nums.length - 1, res = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                res = mid;
                if (first)
                    high = mid - 1;
                else
                    low = mid + 1;
            } else if (nums[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return res;
    }
}
