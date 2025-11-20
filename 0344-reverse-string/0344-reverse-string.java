class Solution {
    public void reverseString(char[] s) {
        int n=s.length;
        revstr(s , 0, n-1);
        
    }
    private void revstr(char[] s , int i ,int j ){

        if(i>=j) return ;
        char temp=s[i];
        s[i]=s[j];
        s[j]=temp;

        revstr(s,i+1,j-1);
    }
}