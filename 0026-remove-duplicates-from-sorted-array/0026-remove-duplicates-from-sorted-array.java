class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int left=0;
        int right=1;
        int count=0;

        while(right<n){
            if(nums[left]!=nums[right]){
                left++;
                nums[left]=nums[right];
            }right++;
        }
        return left + 1;
    }
}