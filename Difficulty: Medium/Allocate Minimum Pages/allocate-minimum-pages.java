class Solution {
    public int findPages(int[] arr, int k) {
        // code here
        int n=arr.length;
        int low=0;
        int high=0;
        
        if (n>=k){
            for(int ar:arr){
                low=Math.max(low,ar);
                high+=ar;
            }
            while(low<high){
                int mid=low+(high-low)/2;
                
                if(canpages(arr,k,mid)){
                    high=mid;
                }else{
                    low=mid+1;
                }
            }
            return low;
        }
        return -1;
    }
    
    private boolean canpages(int[] arr ,int k ,int mid){
        int minpage=0;
        int count=1;
        
        for(int ar:arr){
            if(minpage +ar>mid){
                count++;
                minpage=0;
            }
            minpage+=ar;
            
            if(count>k){
                return false;
            }
        }
        return true;
    }
}