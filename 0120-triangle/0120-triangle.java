class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();

        int[][] dp = new int[n][n];

        for(int[] row : dp){
            Arrays.fill(row, Integer.MAX_VALUE);
        }

        return solve(0, 0, n, triangle, dp);
    }
    int solve(int i, int j, int n, List<List<Integer>> triangle, int[][] dp){
        if(i == n-1) return triangle.get(i).get(j);

        if(dp[i][j] != Integer.MAX_VALUE) return dp[i][j];

        int down = triangle.get(i).get(j) + solve(i+1, j, n, triangle, dp);

        int dg = triangle.get(i).get(j) + solve(i+1, j+1, n, triangle, dp);

        return dp[i][j] = Math.min(down, dg);

    }
}