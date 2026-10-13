class Solution {
    public boolean threeFibonacciSum(int n) {
        int a = n / 2;
        int b=0;
        int c=1;
        if(n%2!=0) return false;

        while(c<a){
            int temp=b+c;
            b=c;
            c=temp;
        }

        return c==a;
    }
}