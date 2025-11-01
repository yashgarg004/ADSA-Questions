class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int[] number=new int[n];
        
        int i=0;
        int j=1;

        for(int s=0;s<n;s++){
            if(nums[s]>0){
                number[i]=nums[s];
                i=i+2;
            }else{
                number[j]=nums[s];
                j=j+2;
            }
        }
        
        return number;
    }
}