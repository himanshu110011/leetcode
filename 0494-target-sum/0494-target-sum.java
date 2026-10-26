class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int n = nums.length;
        int totSum = 0;

        for(int i : nums){
            totSum += i;
        }
        
        if(Math.abs(target) > totSum) return 0;

        if ((totSum + target) % 2 != 0) return 0;

        int sum = (totSum + target) / 2;

        int[][] dp = new int[n+1][sum + 1];
        dp[0][0] = 1;

        for(int i=1; i<n+1; i++){
            for(int j=0; j<sum+1; j++){
                dp[i][j] = dp[i-1][j];
                if(nums[i-1] <= j){
                    dp[i][j] += dp[i-1][j-nums[i-1]];
                }
            }
        }
        return dp[n][sum];
    }
}