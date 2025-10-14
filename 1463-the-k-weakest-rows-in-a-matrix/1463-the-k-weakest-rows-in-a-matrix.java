class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int r = mat.length;
        int c = mat[0].length;
        int[][] val = new int[r][2];
        int[] res = new int[k];
        int count = 0;

        for (int i = 0; i < r; i++) {
            int col = c - 2;
            int row = 0;
            if (mat[i][c-1] != 1) {
                while (row <= col) {
                    int mid = row + (col - row) / 2;
                    if (mat[i][mid] == 1) {
                        row = mid + 1;
                    } else {
                        col = mid - 1;
                    }
                }
            }else{
                row=c;
            }
            val[i][0] = row;
            val[i][1] = i;
        }
        Arrays.sort(val, (a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);

        for (int s = 0; s < k; s++) {
            res[s] = val[s][1];
        }
        return res;

        // for(int i=0;i<r;i++ ){
        //     int count =0;
        //     for(int j=0;j<c;j++){
        //         if (mat[i][j]==1){
        //             count++;
        //         }else{
        //             break;
        //         }
        //     }
        //         val[i][0]=count;
        //         val[i][1]=i;
        // }
        //     Arrays.sort(val , (a,b) -> a[0]==b[0] ? a[1]-b[1] : a[0]-b[0]);

        // for(int s=0;s<k;s++){
        //     res[s]=val[s][1];
        // }
        // return res;
    }
}