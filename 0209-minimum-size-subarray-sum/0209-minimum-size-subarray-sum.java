class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0;
        int sum=0;
        int mini=Integer.MAX_VALUE;
        for(int r=0;r<nums.length;r++){
            sum+=nums[r];
            while(sum>=target){
                mini=Math.min(mini,r-l+1);
                sum-=nums[l];
                l++;
            }
        }
        if(mini==Integer.MAX_VALUE) return 0;
        else return mini;
    }
}