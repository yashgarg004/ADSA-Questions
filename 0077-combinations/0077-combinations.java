class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        res(n , k , ans , new ArrayList<>(),1);
        return ans;
    }

    public void res(int n , int k , List<List<Integer>> ans , ArrayList<Integer> ls, int i){
        if(ls.size()==k){
            ans.add(new ArrayList<>(ls));
            return;
        }

        for(int j=i ; j<=n ; j++){
            ls.add(j);
            res(n , k ,ans , ls , j+1 );
            ls.remove(ls.size()-1);
        }
    }
}