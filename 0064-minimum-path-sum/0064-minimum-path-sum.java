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

        int[] prev = new int[n];

        for(int i=0; i<m; i++){
            int[] curr = new int[n];
            for(int j=0; j<n; j++){
                if(i == 0 && j == 0) curr[j] = grid[0][0];
                else{
                    int up = Integer.MAX_VALUE;
                    int left = Integer.MAX_VALUE;

                    if(i > 0) up = grid[i][j] + prev[j];
                    if(j > 0) left = grid[i][j]  + curr[j-1];

                    curr[j] = Math.min(up, left);
                }
            }
            prev = curr;
        }
        return prev[n-1];
    }
}