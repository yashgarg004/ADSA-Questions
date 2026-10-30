class Solution {
    int[] arr;
    public int[] findRedundantConnection(int[][] edges) {
        int n=edges.length;
        arr = new int[n+1];

        for(int i=1 ; i<=n ; i++){
            arr[i]=i;
        }

        for(int[] edge:edges){
            int u=edge[0];
            int v=edge[1];


            int pu=res(u);
            int pv=res(v);

            if(pu==pv) return edge;

            arr[pu]=pv;
        }

        return new int[0];
    }

    public int res(int x){
        if(arr[x]!=x){
            arr[x]=res(arr[x]);
        }
        return arr[x];
    }
}