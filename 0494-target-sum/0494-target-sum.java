class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int n = nums.length;

        int totSum = 0;
        for (int i : nums) {
            totSum += i;
        }

        if (Math.abs(target) > totSum)
            return 0;
        if ((totSum - target) % 2 != 0)
            return 0;
        int sum = (totSum - target) / 2;

        int[][] dp = new int[n][sum + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return solve(n - 1, nums, sum, dp);
    }

    public int solve(int i, int[] nums, int sum, int[][] dp) {
        if (i == 0) {
            if (sum == 0 && nums[0] == 0)
                return 2;
            if (sum == 0 || nums[0] == sum)
                return 1;
            return 0;
        }
        if (dp[i][sum] != -1) {
            return dp[i][sum];
        }
        int notTake = solve(i - 1, nums, sum, dp);

        int take = 0;
        if (nums[i] <= sum) {
            take = solve(i - 1, nums, sum - nums[i], dp);
        }

        return dp[i][sum] = take + notTake;
    }
}