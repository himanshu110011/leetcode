class Solution {
    public int deleteAndEarn(int[] nums) {
        int max = 0;
        for (int num : nums) {
            max = Math.max(max, num);
        }
        int[] sum = new int[max + 1];

        for (int num : nums) {
            sum[num] += num;
        }

        int dp[] = new int[max + 1];

        dp[0] = 0;
        for (int i = 1; i <= max; i++) {
            int notTake = dp[i - 1];
            int take = sum[i];

            if (i > 1) {
                take += dp[i - 2];
            }

            dp[i] = Math.max(take, notTake);

        }
        return dp[max];

    }

    public int solve(int i, int[] dp, int[] sum) {
        if (i <= 0)
            return 0;

        if (dp[i] != -1)
            return dp[i];

        int notTake = solve(i - 1, dp, sum);

        int take = sum[i] + solve(i - 2, dp, sum);

        dp[i] = Math.max(take, notTake);

        return dp[i];
    }
}