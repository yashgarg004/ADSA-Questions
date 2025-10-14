class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int n = nums.length;
        int max = 0;
        for(int i= 0; i<n;i++){
           if (nums[i]>max){
            max=nums[i];
           }
        }

        int left=1 ; int right=max; int ans =max;
        while(left<=right){
            int mid =left +(right-left)/2;
            int sum=0;

            for(int i=0;i<n;i++){
                sum=sum+ (int)Math.ceil((double)nums[i]/mid);
            }
            if (sum <= threshold) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;

    }
}