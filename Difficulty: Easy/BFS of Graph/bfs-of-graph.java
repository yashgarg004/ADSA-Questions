class Solution {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        int n=adj.size();
        boolean[] visit=new boolean[n];
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<Integer> que= new LinkedList();
        
        que.add(0);
        visit[0]=true;
        
        res(adj , visit , ans , que);
        return ans;
    }
    
    public void res(ArrayList<ArrayList<Integer>> adj , boolean[] visit , ArrayList<Integer> ans , Queue<Integer> que){
        if(que.isEmpty()) return;
        
        int node=que.poll();
        ans.add(node);
        
        for(int ver:adj.get(node)){
            if(!visit[ver]){
                visit[ver]=true;
                que.add(ver);
            }
        }
        res(adj , visit , ans , que);
    }
}