class Solution {
    public int solve(int i, int j1, int j2, int[][] grid, int[][][] dp) {
        int n = grid.length;
        int m = grid[0].length;
        if (j1 < 0 || j1 >= m || j2 < 0 || j2 >= m) {
            return Integer.MIN_VALUE;
        }
        if (i == n - 1) {
            if (j1 == j2)
                return grid[i][j1];
            else
                return grid[i][j1] + grid[i][j2];
        }
        if (dp[i][j1][j2] != -1)
            return dp[i][j1][j2];
        int max = 0;
        for (int dj1 = -1; dj1 <= 1; dj1++) {
            for (int dj2 = -1; dj2 <= 1; dj2++) {
                int point = 0;
                if (j1 == j2)
                    point = grid[i][j1] + solve(i + 1, j1 + dj1, j2 + dj2, grid, dp);
                else
                    point = grid[i][j2] + grid[i][j1] + solve(i + 1, j1 + dj1, j2 + dj2, grid, dp);
                max = Math.max(point, max);
            }
        }
        return dp[i][j1][j2] = max;
    }

    public int cherryPickup(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        int[][][] dp = new int[n][m][m];
        for (int j1 = 0; j1 < m; j1++) {
            for (int j2 = 0; j2 < m; j2++) {
                if (j1 == j2)
                    dp[n - 1][j1][j2] = grid[n - 1][j1];
                else
                    dp[n - 1][j1][j2] = grid[n - 1][j1] + grid[n - 1][j2];
            }
        }

            for (int i = n - 2; i >= 0; i--) {
                for (int j1 = 0; j1 < m; j1++) {
                    for (int j2 = 0; j2 < m; j2++) {
                        int max = Integer.MIN_VALUE;
                        for (int dj1 = -1; dj1 <= 1; dj1++) {
                            for (int dj2 = -1; dj2 <= 1; dj2++) {
                                int point = 0;
                                if (j1 == j2)
                                    point = grid[i][j1];
                                else
                                    point = grid[i][j2] + grid[i][j1];
                                if(j1+dj1 >= 0 && j1+dj1<m && j2+dj2>=0 && j2+dj2<m) point += dp[i+1][j1+dj1][j2+dj2];
                                else point += -1e8;
                                max = Math.max(point, max);
                            }
                        }
                        dp[i][j1][j2] = max;
                    }
                }
            }
        return dp[0][0][m-1];
    }
}