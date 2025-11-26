class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        backtrack(n,0,0,ans ,"" );
        return ans;
    }

    private void backtrack(int n , int start ,int end , List<String> ans,String S){

        if(S.length() == 2*n) {
            ans.add(S);
            return ;
        }

        if(start<n) backtrack(n , start+1 , end , ans ,S + "(");
        if(end<start) backtrack(n , start , end+1 , ans ,S+ ")");
    }
}