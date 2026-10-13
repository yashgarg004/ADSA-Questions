class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
        // if(n==2) return 0;

        int step1=res(nums , 0 , n-2);
        int step2=res(nums , 1 , n-1);

        return Math.max(step1 , step2);
        
    }

    public int res(int[] nums , int start , int end){
        int prev1=0;
        int prev2=0;

        for(int i=start; i<=end ; i++){
            int temp=Math.max(prev1 , prev2+nums[i]);

            prev2=prev1;
            prev1=temp;
        }
        return prev1;
    }
}