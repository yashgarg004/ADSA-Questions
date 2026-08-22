class Solution {
    public int nearestDrone(int[][] drones, int[] target) {
        int n = drones.length;
        int min = Integer.MAX_VALUE;
        int ans = -1;

        for (int i = 0; i < n; i++) {
            int dist = Math.abs(drones[i][0] - target[0]) + Math.abs(drones[i][1] - target[1]);

            if (dist <= drones[i][2]) {
                if (dist < min) {
                    min=dist;
                    ans = i;
                }
            }
        }
        return ans;
    }
}