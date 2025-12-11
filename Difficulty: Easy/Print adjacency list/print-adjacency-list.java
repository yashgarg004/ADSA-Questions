// User function Template for Java
class Solution {
    public List<List<Integer>> printGraph(int V, int edges[][]) {
        List<List<Integer>> adjlist = new ArrayList<>(V);
        for(int i=0 ; i<V ; i++){
            adjlist.add(new ArrayList<>());
        }
        
        for (int i = 0; i < edges.length; i++) {
            int a = edges[i][0];
            int b = edges[i][1];
            addEdge(a, b, adjlist);
        }
        return adjlist;
    }
    
    private void addEdge(int a ,int b ,List<List<Integer>> adjlist ){
        adjlist.get(a).add(b);
        adjlist.get(b).add(a);
    }
}