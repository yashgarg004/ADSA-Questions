class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;

        Queue<int[]> que = new LinkedList<>();
        for(int i=0;i<n ; i++){
            for(int j=0 ; j<m ; j++){
                if(mat[i][j]==0){
                    que.offer(new int[]{i,j});
                }else{
                    mat[i][j]=-1;
                }
            }
        }
        int[][] moves={{-1,0}, {1,0},{0,-1},{0,1}};

        while(!que.isEmpty()){
            int[] curr=que.poll();
            int i=curr[0];
            int j=curr[1];

            for(int[] mm:moves){
                int ni=i+mm[0];
                int nj=j+mm[1];

                if(ni>=0 && ni<n && nj>=0 && nj<m && mat[ni][nj]==-1){
                    mat[ni][nj]=1+mat[i][j];
                    que.offer(new int[]{ni , nj});
                }
            }
        }
        return mat;



    }
}