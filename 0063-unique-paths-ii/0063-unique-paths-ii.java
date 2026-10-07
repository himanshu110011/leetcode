class Solution {
    public int solve(int i, int j, int[][] dp, int[][] grid){
        if(i == 0 && j == 0) return 1;
        if(i < 0 || j < 0) return 0;
        if(i >= 0 && j >= 0 && grid[i][j] == 1) return 0;
        
        if(dp[i][j] != -1) return dp[i][j];

        int up = solve(i-1, j, dp, grid);
        int down  = solve(i, j-1, dp, grid);

        return dp[i][j] = up + down;
    }
    public int uniquePathsWithObstacles(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int dp[][] = new int[m][n];
        
        if(grid[0][0] == 1) return 0;

        for(int[] row : dp){
            Arrays.fill(row, -1);
        }

        return solve(m-1,  n-1, dp, grid);
    }
}