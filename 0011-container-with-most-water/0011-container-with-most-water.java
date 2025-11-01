class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int low=0;
        int high=n-1;
        int maxarea=0;

        while(low<high){
                int width=high-low;
            if(height[low]>=height[high]){
                int area=width*height[high];
                maxarea=Math.max(maxarea,area);
                high--;
            }else{
                
                int area=width*height[low];
                maxarea=Math.max(maxarea,area);
                low++;
            }
        }
        return maxarea;
    }
}