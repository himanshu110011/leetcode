class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int n = nums.length;
        int totSum = 0;

        for(int i : nums){
            totSum += i;
        }
        
        if(Math.abs(target) > totSum) return 0;

        if((totSum + target) % 2 != 0) return 0;
        
        return solve(n-1, (target + totSum) / 2, nums);
    }
    public int solve(int i, int sum, int[] nums){
        if(i<0){
            if(sum == 0) return 1;
            else return 0;
        }
        
        int notTake = solve(i-1, sum, nums);

        int take= 0;
        if(nums[i] <= sum){
            take = solve(i-1, sum-nums[i], nums);
        }
        return take + notTake;
    }
}