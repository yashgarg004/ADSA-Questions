class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        res(candidates , target , ans , new ArrayList<>() , 0 , 0);
        return ans;
    }
    public void res(int[] candidates , int target , List<List<Integer>> ans , ArrayList<Integer> ls , int start , int sum){
        if(sum==target){
            ans.add(new ArrayList(ls));
            return;
        }
        if(sum>target){
            return;
        }
        for(int i=start ; i<candidates.length ; i++){
            if(i>start && candidates[i]==candidates[i-1]) continue;
            sum+=candidates[i];
            ls.add(candidates[i]);
            res(candidates , target , ans , ls , i+1 ,sum);
            ls.remove(ls.size()-1);
            sum-=candidates[i];
        }
    }
}