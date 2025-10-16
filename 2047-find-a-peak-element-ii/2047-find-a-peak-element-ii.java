class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int row=mat.length;
        int col=mat[0].length;
        int left=0;
        int right=col-1;

        while(left<=right){
            int mid=left+(right-left)/2;

            int r=0;
            for(int i=0;i<row;i++){
                if(mat[i][mid]>mat[r][mid]){
                    r=i;
                }
            }
            int rightcol=(mid +1 < col) ? mat[r][mid+1] : -1;
            int leftcol=(mid-1>=0) ? mat[r][mid-1] : -1;

            if(mat[r][mid]>rightcol && mat[r][mid]>leftcol){
                return new int[]{r,mid};
            }else if (mat[r][mid]<leftcol){
                right= mid-1;
            }else{
                left=mid+1;
            }
        }
        return new int[]{-1,-1};
    }
}