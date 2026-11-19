
class Solution {
    int[][][] dp;
    int n;

    public int cherryPickup(int[][] grid) {
        n = grid.length;

        dp = new int[n][n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                Arrays.fill(dp[i][j], Integer.MIN_VALUE);
            }
        }

        int ans = solve(0, 0, 0, grid);

        return Math.max(0, ans);
    }

    int solve(int r1, int c1, int r2, int[][] grid) {

        int c2 = r1 + c1 - r2;

        if (r1 >= n || c1 >= n ||
            r2 >= n || c2 >= n) {
            return -1000000;
        }

        if (grid[r1][c1] == -1 ||
            grid[r2][c2] == -1) {
            return -1000000;
        }

        if (r1 == n - 1 && c1 == n - 1) {
            return grid[r1][c1];
        }

        if (dp[r1][c1][r2] != Integer.MIN_VALUE) {
            return dp[r1][c1][r2];
        }

        int a = solve(r1 + 1, c1, r2 + 1, grid);
        int b = solve(r1 + 1, c1, r2, grid);
        int c = solve(r1, c1 + 1, r2 + 1, grid);
        int d = solve(r1, c1 + 1, r2, grid);

        int cherries = grid[r1][c1];

        if (r1 != r2 || c1 != c2) {
            cherries += grid[r2][c2];
        }

        return dp[r1][c1][r2] =
            cherries + Math.max(Math.max(a, b), Math.max(c, d));
    }
}
