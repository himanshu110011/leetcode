
import java.util.Arrays;

class Solution {
    public int solve(int i, int j, int[][] dungeon, int[][] dp) {
        int n = dungeon.length;
        int m = dungeon[0].length;

        if (i >= n || j >= m) {
            return Integer.MAX_VALUE;
        }

        if (i == n - 1 && j == m - 1) {
            return Math.max(1, 1 - dungeon[i][j]);
        }

        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        int down = solve(i + 1, j, dungeon, dp);
        int right = solve(i, j + 1, dungeon, dp);

        int required = Math.min(down, right) - dungeon[i][j];

        return dp[i][j] = Math.max(1, required);
    }

    public int calculateMinimumHP(int[][] dungeon) {
        int n = dungeon.length;
        int m = dungeon[0].length;

        int[][] dp = new int[n][m];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return solve(0, 0, dungeon, dp);
    }
}
