class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;

        while (l <= r) {
            int m = l + (r - l) / 2; 

            if (nums[m] == target) {
                return m;
            } else if (target < nums[m]) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }

        return -1; 
    }
}
