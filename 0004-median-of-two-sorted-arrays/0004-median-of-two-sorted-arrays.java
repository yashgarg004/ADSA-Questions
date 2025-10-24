class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int s=n+m;
        int[] nums=new int[s];
        
        int i=0;
        int j=0;
        int k=0;

        while(i<n && j<m){
            if(nums1[i]<=nums2[j]){
                nums[k++]=nums1[i++];
            }else{
                nums[k++]=nums2[j++];
            }
        }
        while (i < n) nums[k++] = nums1[i++];
        while (j < m) nums[k++] = nums2[j++];

        if(s%2==1){
            
            return nums[s/2];
        }else{
            
            return (nums[s/2-1]+nums[s/2]) /2.0;
        }
        
    }
}