class Solution {
    public int tribonacci(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);

        return solve(n, dp);
    }
    public int solve(int n, int[] dp){
        if(n < 2) return n;
        if(n == 2) return 1;

        if(dp[n] != -1) return dp[n];

        int a = solve(n-1, dp);
        int b = solve(n-2, dp);
        int c = solve(n-3, dp);

        dp[n] = a + b + c;
        return a + b + c;
    }
}