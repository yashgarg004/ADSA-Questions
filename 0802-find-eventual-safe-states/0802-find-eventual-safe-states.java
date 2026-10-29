class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        List<Integer> ans = new ArrayList<>();
        int n= graph.length;
        int[] res = new int[n];

        for(int i=0 ; i<n ; i++){
            if(dfs(i, graph , res)){
                ans.add(i);
            }
        }
        return ans;

    }

    private boolean dfs(int start , int[][] graph , int[] res){
        if(res[start]!=0){
            return res[start]==2;
        }

        res[start]=1;

        for(int node:graph[start]){
            if(!dfs(node , graph , res)){
                return false;
            }
        }

        res[start]=2;
        return true;
    }
}