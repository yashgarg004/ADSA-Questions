class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans= new ArrayList<>();
        res(k , n , ans , new ArrayList<>() , 1 , 0);
        return ans;
    }
    public void res(int k , int n , List<List<Integer>> ans , ArrayList ls ,int start , int sum){
        if(k==ls.size() && n==sum){
            ans.add(new ArrayList(ls));
            return;
        }
        
        for(int i=start ; i<10 ; i++){
            ls.add(i);
            sum+=i;
            res(k , n , ans , ls , i+1 , sum);
            sum-=i;
            ls.remove(ls.size() - 1);
        }
    }
}