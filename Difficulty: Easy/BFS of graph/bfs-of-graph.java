class Solution {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> ans = new ArrayList<>();
        int V = adj.size();
        
        boolean[] visited = new boolean[V];
        Queue<Integer> q = new LinkedList<>();
        
        q.add(0);
        visited[0] = true;
        
        while (!q.isEmpty()) {
            int node = q.poll();
            ans.add(node);
            
            for (int neigh : adj.get(node)) {
                if (!visited[neigh]) {
                    visited[neigh] = true;
                    q.add(neigh);
                }
            }
        }
        return ans;
    }
}
