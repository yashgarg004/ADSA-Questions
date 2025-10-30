class Solution {
    public int strStr(String haystack, String needle) {
        int n=haystack.length();
        int m=needle.length();

        if (m == 0) return 0;
        if (m > n) return -1;

        for(int i=0;i<=n-m;i++){
            int j;
            for(j=0;j<m;j++){
                if(haystack.charAt(i+j)!=needle.charAt(j)){
                    break;
                }
            }
            if(j==m){
                return i;
            }
        }
        // int left=0;
        // int right=0;
        // int j=0

        // if(haystack.length<needle.length){
        //     return -1;
        // }else{
        //     while(right<n){
        //         if(haystack.charAt[left])
        //     }
        // }
        return -1;
    }
}