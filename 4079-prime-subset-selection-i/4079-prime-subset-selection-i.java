class Solution {
    public List<Integer> maxPrimes(int n, int s) {
        List<Integer> ans = new ArrayList<>();
        boolean[] prime = new boolean[n + 1];
        Arrays.fill(prime, true);

        if (n >= 0)
            prime[0] = false;
        if (n >= 1)
            prime[1] = false;

        for (int i = 2; (long)i * i <= n; i++) {
            if (prime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    prime[j] = false;
                }
            }
        }
        long sum = 0;

        for (int i = 2; i <= n; i++) {
            if (prime[i] && sum + i <= s) {
                ans.add(i);
                sum += i;
            }
        }
        return ans;
    }
}