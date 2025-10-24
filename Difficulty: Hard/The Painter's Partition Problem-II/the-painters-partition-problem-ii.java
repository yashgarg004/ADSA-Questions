class Solution {
    public int minTime(int[] arr, int k) {
        // code here
        int n=arr.length;
        int low=0;
        int high=0;
        
        for(int board:arr){
            low=Math.max(low,board);
            high+=board;
        }
        
        while(low<high){
            int mid=low+(high-low)/2;
            if(canpaint(arr,k,mid)){
                high=mid;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
    
    private boolean canpaint(int[] arr , int k , int mid){
        int count=1; int load=0;
        
        for(int board:arr){
            if(load +board>mid){
                count++;
                load=0;
            }
            load+=board;
            if(count>k){
                return false;
            }
        }
        return true;
    }
}
