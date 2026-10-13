class Solution {
    public boolean canPartition(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for (int i : nums) {
            sum += i;
        }
        if (sum % 2 != 0)
            return false;
        Boolean[][] dp = new Boolean[n][sum / 2 + 1];
        return solve(n - 1, sum / 2, nums, dp);
    }

    public boolean solve(int i, int sum, int[] nums, Boolean[][] dp) {
        if (sum == 0)
            return true;

        if (i == 0)
            return nums[0] == sum;

        if (dp[i][sum] != null)
            return dp[i][sum];

        boolean notTake = solve(i - 1, sum, nums, dp);

        boolean take = false;
        if (nums[i] < sum) {
            take = solve(i - 1, sum - nums[i], nums, dp);
        }
        return dp[i][sum] = take || notTake;
    }
}