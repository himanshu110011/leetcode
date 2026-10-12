class Solution {
    public int solve(int i, int j1, int j2, int[][] grid, int[][][] dp) {
        int n = grid.length;
        int m = grid[0].length;
        if (j1 < 0 || j1 >= m || j2 < 0 || j2 >= m)
            return Integer.MIN_VALUE;

        if (i == n - 1) {
            if (j1 == j2)
                return grid[i][j1];
            else
                return grid[i][j1] + grid[i][j2];
        }

        if (dp[i][j1][j2] != -1)
            return dp[i][j1][j2];

        int max = 0;

        for (int dj1 = -1; dj1 < 2; dj1++) {
            for (int dj2 = -1; dj2 < 2; dj2++) {
                int value = 0;
                if (j1 == j2)
                    value = grid[i][j1] + solve(i + 1, j1 + dj1, j2 + dj2, grid, dp);
                else
                    value = grid[i][j1] + grid[i][j2] + solve(i + 1, j1 + dj1, j2 + dj2, grid, dp);

                max = Math.max(max, value);
            }
        }
        return dp[i][j1][j2] = max;
    }

    public int cherryPickup(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        int[][][] dp = new int[n][m][m];

        for (int[][] r : dp) {
            for (int[] ror : r) {
                Arrays.fill(ror, -1);
            }
        }
        return solve(0, 0, m - 1, grid, dp);
    }
}