class Solution {
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        int n=adj.size();
        boolean[] visit= new boolean[n+1];
        visit[0]=true;
        // Queue<Integer> que=new LinkedList();
        ArrayList<Integer> ans=new ArrayList<>();
        res(adj, visit , ans , 0);
        return ans;
    }
    public void res(ArrayList<ArrayList<Integer>> adj , boolean[] visit , ArrayList<Integer> ans , int node){
        visit[node]=true;
        ans.add(node);
        
        for(int ver:adj.get(node)){
            if(visit[ver]==false){
                res(adj ,visit , ans , ver);
            }
        }
    }
}