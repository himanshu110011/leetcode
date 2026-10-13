class Solution {
    public int solve(int i, int[] cost, int[] dp){
        if(i == 0) return cost[0];
        if(i == 1) return cost[1];
        if(dp[i] != -1) return dp[i];
        int fj = cost[i] + solve(i-1, cost, dp);
        int sj = cost[i] + solve(i-2, cost, dp);

        return dp[i] = Math.min(fj, sj);
    }
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;

        int dp[] = new int[n];
        Arrays.fill(dp, -1);
        return Math.min(solve(n-1, cost, dp), solve(n-2, cost, dp));
    }
}