class Solution {
    public int tribonacci(int n) {
        int[] arr=new int[n+1];
        Arrays.fill(arr,-1);
        return rec(n , arr);

    }

    private int rec(int n , int[]arr){
         if (n == 0) return 0;
        if (n == 1 || n == 2) return 1;

        if (arr[n] != -1) {
            return arr[n];
        }

        arr[n]=rec(n-1,arr) + rec(n-2,arr) + rec(n-3,arr);
        return arr[n];
    }
}