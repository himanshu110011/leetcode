class Solution {
    public int change(int a, int[] coins) {
        int n = coins.length;

        int[][] dp = new int[n][a + 1];

        for(int[] row : dp){
            Arrays.fill(row, -1);
        }

        return solve(n-1, a, coins, dp);
    }
    public int solve(int i, int a, int[] coins, int[][] dp){
        if(i == 0){
            if(a  % coins[0] == 0) return 1;
            else return 0;
        }
        if(dp[i][a] != -1) return dp[i][a];

        int notTake = solve(i-1, a, coins, dp);

        int take = 0;

        if(coins[i] <= a){
            take = solve(i, a-coins[i], coins, dp);
        }
        return dp[i][a] = take + notTake;
    }
}