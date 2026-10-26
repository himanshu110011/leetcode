class Solution {
    public int uniquePathsWithObstacles(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        int dp[][] = new int[m][n];
        for(int[] row : dp){
            Arrays.fill(row, -1);
        }
        if(arr[m-1][n-1] == 1)return 0;
        if(arr[0][0] == 1) return 0;
        return solve(0, 0, m, n, arr, dp);
    }
    public int solve(int i, int j, int m, int n, int[][] arr, int[][] dp){
        if(i== m-1 && j == n-1) return 1;
        if(i >= m || j >= n || arr[i][j] == 1) return 0;

        if(dp[i][j] != -1) return dp[i][j];

        int down = solve(i, j+1, m, n, arr, dp);
        int right = solve(i+1, j, m, n, arr, dp);

        return dp[i][j] = down + right;
    }
}