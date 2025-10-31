class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int s= m-1;
        int k= n-1;
        int j=m+n-1;
        
        while(s>=0 && k>=0){
            if(nums1[s]>nums2[k]){
                nums1[j]=nums1[s];
                s--;
            }else{
                nums1[j]=nums2[k];
                k--;
            }
            j--;
        }

        while(k>=0){
            nums1[j]=nums2[k];
            k--;
            j--;
        }
    }
}