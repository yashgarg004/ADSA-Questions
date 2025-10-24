class Solution {
    public int findMin(int[] nums) {
        int n= nums.length;
        int low=0;
        int high=n-1;

        while(low<high){
            int mid=low+(high-low)/2;
            // int lr=mid-1;
            // int hr=mid+1;
            // if(nums[lr]>nums[mid] && nums[mid]<nums[hr]){
            //     return mid;
            // }else if(nums[lr]<nums[mid] && nums[mid]<nums[hr]){
            //     low=mid+1;
            // }else{
            //     high=mid-1;
            // }
            if(nums[mid]>nums[high]){
                low=mid+1;
            }else{
                high=mid;
            }
        }
        return nums[low];
    }
}