class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low=0;
        int high=0;

        for(int w: weights){
             low=Math.max(low,w);
             high+=w;
        }

        while(low<high){
            int mid =(high+low)/2;
            if (canShip(weights, days , mid)){
                high=mid;
            }else{
                low=mid+1;
            }
        }

        return low;
    }
    private boolean canShip(int[] weights ,int days ,int capacity ){
        int dayCount =1;
        int load=0;

        for(int w:weights){
            if(load + w>capacity){
                dayCount++;
                load=0;
            }
            load+=w;

            if(dayCount>days){
                return false;
            }
        }
        return true;
    }
}