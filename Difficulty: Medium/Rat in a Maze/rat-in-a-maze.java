class Solution {
    public ArrayList<String> ratInMaze(int[][] maze) {
        // code here
        int n=maze.length;
        ArrayList<String> ans = new ArrayList<>();
        boolean[][] visit = new boolean[n][n];
        if(maze[0][0]==0 || maze[n-1][n-1]==0) return ans;
        res(maze , ans , new StringBuilder() ,0 ,0, visit);
        return ans;
    }
    public void res(int[][] maze , ArrayList<String> ans , StringBuilder ls , int start , int end,
    boolean[][] visit){
        int n=maze.length;
        
        if(start<0 || end<0 || start>=n || end>=n || maze[start][end]==0 || visit[start][end]) return;
        if(start==n-1 && end==n-1){
            ans.add(ls.toString());
            return;
        }
        
        visit[start][end] = true;
        
        ls.append('D');
        res(maze , ans , ls ,start+1, end , visit );
        ls.deleteCharAt(ls.length()-1);
        
        ls.append('L');
        res(maze , ans , ls , start , end-1 , visit);
        ls.deleteCharAt(ls.length()-1);
        
        ls.append('R');
        res(maze , ans , ls , start , end+1 , visit);
        ls.deleteCharAt(ls.length()-1);
        
        ls.append('U');
        res(maze , ans , ls , start-1 , end, visit);
        ls.deleteCharAt(ls.length()-1);
        
        
        visit[start][end]=false;
    }
}