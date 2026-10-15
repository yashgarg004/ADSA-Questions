class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int maxarea=0;

        for(int i=0;i<n ; i++){
            for(int j=0 ; j<m ; j++){
                if(grid[i][j]==1){
                    int connectarea=res(grid , i , j );
                    maxarea=Math.max(maxarea, connectarea); 
                }
            }
        }
        return maxarea;
    }

    public int res(int[][] grid , int i , int j){
        int n=grid.length;
        int m = grid[0].length;

        if(i<0 || j<0 || i>=n || j>=m || grid[i][j]==0)return 0;

        grid[i][j]=0;
        int connectarea=1;

        connectarea+=res(grid , i+1,j);
        connectarea+=res(grid,i-1,j);
        connectarea+=res(grid, i , j+1);
        connectarea+=res(grid, i , j-1);

        return connectarea;
    }
}