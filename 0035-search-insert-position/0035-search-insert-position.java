class Solution {
    public int searchInsert(int[] nums, int target) {
        int l=0;
        int n=nums.length;
        int r=n-1;
        int mis=0;
        while(l<=r){
            int m =l+(r-l)/2;
            if(nums[m]==target){
                return m;
            }
            else if(nums[m]>target){
                    r=m-1;
            }else{
                    if(nums[m]<target){
                        l=m+1;
                    }
                }
                   
        }
        return l ;
    }
}