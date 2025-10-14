class Solution {
    public int arrangeCoins(int n) {
        int i=0;
        int count=0;
        int max=0;
        int sum=n;
        while(max<=sum){
            max=1+max;
            if (max<=sum){
                count++;
            }
            sum=sum-max;
            
        }
        // if (sum>0 && sum<max){
        //     co=count+1;
        // }
        return count;
    }
}