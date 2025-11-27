class Solution {
    public ArrayList<String> binstr(int n) {
        // code here
        ArrayList<String> ans = new ArrayList<>();
        backtrack(n , ans , new StringBuilder());
        
        return ans;
    }
    
    private void backtrack(int n , ArrayList<String> ans , StringBuilder res ){
        if(n==res.length()){
            ans.add(res.toString());
            return ; 
        }
        
        if(res.length()<n){
            res.append("0");
            backtrack(n,ans , res);
            res.deleteCharAt(res.length() - 1);
        }
        
        if(res.length()<n){
            res.append("1");
            backtrack(n,ans , res);
            res.deleteCharAt(res.length() - 1);
        }
        
    }
}
