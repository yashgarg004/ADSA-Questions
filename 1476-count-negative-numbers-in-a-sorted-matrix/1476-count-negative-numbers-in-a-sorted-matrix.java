class Solution {
    public int countNegatives(int[][] grid) {
        int r =grid.length;
        int c= grid[0].length;
        int count=0;

        for(int i=0; i<=r-1;i++){
            for (int j=0 ; j<=c-1 ;j++){
               if(grid[i][j]<0) {
                 count =count+1;
               }
            }
        }
        return count;
    }
}