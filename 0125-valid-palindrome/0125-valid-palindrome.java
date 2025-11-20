class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();
        int n = s.length();
        int i = 0;
        int j = n - 1;
        if (canDone( s, i, j)) {
            return true;
        }
        return false;
    }
    
    public boolean canDone(String s , int i , int j){
        if(i>=j){
            return true;
        }
        if(s.charAt(i)!=s.charAt(j)){
            return false;
        }
            
        return canDone(s,i+1,j-1);
        
    }
}