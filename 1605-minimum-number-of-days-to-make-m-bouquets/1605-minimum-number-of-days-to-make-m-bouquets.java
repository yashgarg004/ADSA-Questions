// class Solution {
//     public int minDays(int[] bloomDay, int m, int k) {
//         int n = bloomDay.length;
//         int low = 0;
//         int high = (int)1e9;
//         int flower = m * k;

//         if (m*k > n) {
//             return -1;
//         }
//         for (int flo : bloomDay) {
//             low = Math.min(low, flo);
//             high = Math.max(high, flo);
//         }
//         while (low < high) {
//             int mid = low + (high - low) / 2;
//             if (canflowers(bloomDay, m, k, mid)) {
//                 high = mid;
                
//             } else {
//                 low = mid + 1;
//             }
//         }
//         return low;

//     }

//     private boolean canflowers(int[] bloomDay, int m, int k, int flo) {
//         int count = 0;
//         int bouq = 0;

//         for (int flow : bloomDay) {
//             if (flow <= flo) {
//                 count++;
//                 if (count == k) {
//                     bouq++;
//                     count = 0;
//                     if(bouq>=m) return true;
//                 }
//             } else {
//                 count = 0;
//             }

//         }
//         return bouq >= m;
//     }
// }

class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n=bloomDay.length;
        int low = 0;
        int high = (int)1e9;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int count = 0, bouq = 0;

            for (int i = 0; i < n; i++) {
                if (bloomDay[i] <= mid) {
                    count++;
                    if (count >= k) {
                        bouq++;
                        count = 0;
                    }
                } else {
                    count = 0;
                }
            }

            if (bouq >= m) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}