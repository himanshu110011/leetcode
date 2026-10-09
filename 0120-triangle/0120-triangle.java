class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[][] dp = new int[n][n];

        for(int j=0; j<n; j++){
            dp[n-1][j] = triangle.get(n-1).get(j);
        }

        for(int i=n-2; i>=0; i--){
            for(int j=i; j>=0; j--){
                 int down = triangle.get(i).get(j) + dp[i+1][j];
                 int dg = triangle.get(i).get(j) + dp[i+1][j+1];
                 dp[i][j] = Math.min(down, dg);
            }
        }
        return dp[0][0];
    }
    public int solve(int i, int j, List<List<Integer>> triangle, int[][] dp){
        if(i == triangle.size()-1) return triangle.get(i).get(j);

        if(dp[i][j] != Integer.MAX_VALUE) return dp[i][j];

        int down = triangle.get(i).get(j) + solve(i+1, j, triangle, dp);
        int dg = triangle.get(i).get(j) + solve(i+1, j+1, triangle, dp);
        
        return dp[i][j] = Math.min(down, dg);
    }
}