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

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j] == 1) dp[i][j] = 0; 
                else if(i == 0 && j ==0) dp[i][j] = 1;
                else{
                    int up = 0;
                    int left = 0;
                    if(i>0) up = dp[i-1][j];
                    if(j>0) left = dp[i][j-1];
                    dp[i][j] = up + left;
                }
            }
        }
        return dp[m-1][n-1];
    }
}