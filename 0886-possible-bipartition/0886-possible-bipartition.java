class Solution {
    public boolean possibleBipartition(int n, int[][] dislikes) {
        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            arr.add(new ArrayList());
        }

        for (int[] j : dislikes) {
            arr.get(j[0]).add(j[1]);
            arr.get(j[1]).add(j[0]);
        }

        int[] ans = new int[n + 1];
        Arrays.fill(ans, -1);

        for (int k = 1; k <= n; k++) {
            if (ans[k] == -1) {
                Queue<Integer> que = new LinkedList<>();

                que.offer(k);
                ans[k] = 0;

                while (!que.isEmpty()) {
                    int node = que.poll();

                    for (int s : arr.get(node)) {
                        if (ans[s] == -1) {
                            ans[s] = 1 - ans[node];
                            que.offer(s);
                        } else if (ans[s] == ans[node]) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}