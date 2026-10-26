class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int n = nums.length;
        int totSum = 0;

        for(int i : nums){
            totSum += i;
        }
        
        if(Math.abs(target) > totSum) return 0;

        if((totSum + target) % 2 != 0) return 0;

        int[][] dp = new int[n][(target + totSum) / 2 + 1];
        for(int[] row : dp){
            Arrays.fill(row, -1);
        }
        
        return solve(n-1, (target + totSum) / 2, nums, dp);
    }
    public int solve(int i, int sum, int[] nums, int[][] dp){
        if(i<0){
            if(sum == 0) return 1;
            else return 0;
        }
        if(dp[i][sum] != -1) return dp[i][sum];
        int notTake = solve(i-1, sum, nums, dp);

        int take= 0;
        if(nums[i] <= sum){
            take = solve(i-1, sum-nums[i], nums, dp);
        }
        return dp[i][sum] = take + notTake;
    }
}