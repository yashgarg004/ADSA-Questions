class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        res(candidates , target , 0 , ans , new ArrayList<>() , 0);
        return ans;
    }

    public void res(int[] candidates , int target , int start , List<List<Integer>> ans , ArrayList<Integer> ls , int sum ){
        int n=candidates.length;
        if(target==sum){
            ans.add(new ArrayList(ls));
            return;
        }
        if(target<sum) return;

        for(int i=start ; i<n ; i++){
            sum+=candidates[i];
            ls.add(candidates[i]);
            res(candidates , target , i , ans , ls , sum);
            sum=sum-candidates[i];
            ls.remove(ls.size()-1);
        }
    }
}