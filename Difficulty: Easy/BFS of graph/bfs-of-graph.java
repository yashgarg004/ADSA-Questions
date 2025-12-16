class Solution {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> ans = new ArrayList<>();
        boolean[] visited = new boolean[adj.size()];
        Queue<Integer> q = new LinkedList<>();
        
        q.add(0);
        visited[0] = true;
        
        bfsRecursive(adj, q, visited, ans);
        return ans;
    }
    
    private void bfsRecursive(ArrayList<ArrayList<Integer>> adj, Queue<Integer> q, 
                              boolean[] visited, ArrayList<Integer> ans) {
        if (q.isEmpty()) {
            return;
        }
        
        int node = q.poll();
        ans.add(node);
        
        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) {
                visited[neighbor] = true;
                q.add(neighbor);
            }
        }
        
        bfsRecursive(adj, q, visited, ans);
    }
}
