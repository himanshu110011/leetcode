class Solution {
    public int rob(int[] nums) {
        int n = nums.length;

        if(n == 1) return nums[0];

        int first = solve(0, n-2, nums);

        int last = solve(1, n-1, nums);

        return Math.max(first, last);
    }
    public int solve(int start, int end, int[] nums){
        int prev = 0;
        int prev2 = 0;
        for(int i = start; i<=end; i++){
            int take = nums[i] + prev2;

            int notTake = prev;
            
            int curr = Math.max(take, notTake);
        prev2 = prev;
        prev = curr;  
        }
        return prev;
    }
}