class Solution {
    public List<String> validStrings(int n) {
        List<String> ans = new ArrayList<>();
        backtrack( n , ans , new StringBuilder() );
        
        return ans;

    }
    private void backtrack(int n ,List<String> ans , StringBuilder str ){

        if(n==str.length()){
            ans.add(str.toString());
            return ;
        }

        str.append('1');
        backtrack(n, ans, str);
        str.deleteCharAt(str.length() - 1);

        
        if (str.length() == 0 || str.charAt(str.length() - 1) != '0') {
            str.append('0');
            backtrack(n,ans ,  str);
            str.deleteCharAt(str.length() - 1);
        }
    }
}