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
         
        dp[0] = cost[0];
        dp[1] = cost[1];
        for(int i=2; i<n; i++){
           int fj = cost[i] + dp[i-1];
           int sj = cost[i] + dp[i-2];
           dp[i] = Math.min(fj, sj);
        }
        return Math.min(dp[n-1], dp[n-2]);
    }
}