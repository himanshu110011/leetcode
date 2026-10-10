class Solution {
    public int solve(int i, int j, int[][] matrix, int[][] dp){
        int n = matrix.length;
        int m = matrix[0].length;

         if(j < 0 || j >= m){
            return Integer.MAX_VALUE;
        }

        if(i == n-1) return matrix[i][j];

        if(dp[i][j] != Integer.MAX_VALUE) return dp[i][j];

        int down =  solve(i+1, j, matrix, dp);
        int left =  solve(i+1, j-1, matrix, dp);
        int right =  solve(i+1, j+1, matrix, dp);

        int point = Math.min(down, Math.min(left, right));

        return dp[i][j] = matrix[i][j] + point;
    }
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        int[][] dp = new int[n][m];

        for(int[] row : dp){
            Arrays.fill(row, Integer.MAX_VALUE);
        }
        int min = Integer.MAX_VALUE;

        for(int j=0; j<m; j++){
           int path = solve(0, j, matrix, dp);
           min = Math.min(min, path);
        }
        return min;
    }
}