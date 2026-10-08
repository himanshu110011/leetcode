class Solution {
    public int solve(int m, int n, int[][] grid, int[][] dp){
        if(m == 0 && n == 0) return grid[m][n];
        if(m < 0 || n < 0) return Integer.MAX_VALUE;

        if(dp[m][n] != -1) return dp[m][n];
        int up = Integer.MAX_VALUE; 
        int left = Integer.MAX_VALUE;
        if(m > 0) up = grid[m][n] + solve(m-1, n, grid, dp);

        if(n > 0) left = grid[m][n] + solve(m, n-1, grid, dp);

        return dp[m][n] = Math.min(up, left);
    }
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int[][] dp = new int[m][n];
        for(int[] row : dp){
            Arrays.fill(row, -1);
        }
        return solve(m - 1, n - 1, grid, dp);
    }
}