class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r= matrix.length;
        int c=matrix[0].length; 

        // for(int i=0;i<r;i++){
             
        //     int high=c-1;
        //     if(matrix[i][high]>target){
        //         int low=i;
        //         int mid=low+(high-low)/2;
        //         while(low<=high){
        //             if (mid>target){
        //                 high=mid-1;
        //             }else{
        //                 low=mid+1;
        //             }
        //         }
        //     }else{
        //         break;
        //     }
        // }
        // return true;

        // int lr=0;
        // int hr=r-1;
        
        
        // while(lr<=hr){
        //     int mr=lr+(hr-lr)/2;
        //     if(matrix[mr][0]>target){
        //         hr=mr-1;
        //         int low=0;
        //         int high=c-1;
                
        //         while(low<=high){
        //             int mid=low+(high-low)/2;
        //             if (matrix[mr][mid]>target){
        //                 high=mid-1;
        //                 // return true;
        //             }else{
        //                 low=mid+1;
        //             }
        //         }
        //     }
        //     else{
        //         lr=mr+1;
        //     }
            
        // }
        // return true;

        int low = 0, high = r * c - 1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            int midVal = matrix[mid / c][mid % c]; 
            if (midVal == target) return true;
            else if (midVal < target) low = mid + 1;
            else high = mid - 1;
        }
        return false;
    }
}