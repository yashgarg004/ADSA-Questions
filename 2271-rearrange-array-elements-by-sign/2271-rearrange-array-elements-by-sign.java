class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int[] nums1=new int[n/2];
        int[] nums2=new int[n/2];
        int i=0;
        int j=0;

        for(int num:nums){
            if(num>0){
                nums1[i++]=num;
            }else{
                nums2[j++]=num;
            }
        }
        i=0;
        j=0;

        for(int s=0;s<n;s++){
            if(s%2==0){
                nums[s]=nums1[i++];
            }else{
                nums[s]=nums2[j++];
            }
        }
        
        return nums;
    }
}