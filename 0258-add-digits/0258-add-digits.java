class Solution {
    public int addDigits(int num) {
        if(num<10){
            return num;
        }
        
        return addDigits(sum(num));
    }

    public int sum(int num){
        if(num<10){
            return num;
        }

        return (num%10) + sum(num/10);
    }
}