class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        res(nums , ans , new ArrayList<>() , 0);
        return ans;
    }
    public void res(int[] nums , List<List<Integer>> ans , ArrayList<Integer> ls , int start){
        ans.add(new ArrayList(ls));

        for(int i=start ; i<nums.length ; i++){
            if(i>start && nums[i]==nums[i-1]) continue;
            ls.add(nums[i]);
            res(nums , ans , ls , i+1);
            ls.remove(ls.size() - 1);
        }
    }
}