class Solution {
    public String largestOddNumber(String num) {
        int n = num.length();
        for(int i =n-1; i>=0;i--){
            int res = num.charAt(i)   ;
            if (res % 2 != 0) {
                return num.substring(0, i + 1);
            }
        }
        return "";
    }
}