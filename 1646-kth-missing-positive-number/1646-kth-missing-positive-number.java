class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n= arr.length;
        int mis=0;
        int count =0;
        int index=0;
        for (int i =1; i<arr[n-1];i++){
            if (i!=arr[index]){
                count =count +1 ;
                if (k==count){
                    mis=i;
                }
            }
            else{
                index++;
            }
            
            
        }
        if (k>count){
                mis=n+k;
        }
        
        return mis;
    }
}