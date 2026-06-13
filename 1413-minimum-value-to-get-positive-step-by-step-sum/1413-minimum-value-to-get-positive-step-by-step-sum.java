class Solution {
    public int minStartValue(int[] nums) {
        int st = 0;
        int min = 0;
        for(int i=0;i<nums.length;i++){
            st+=nums[i];
            nums[i]=st;
            min=Math.min(min,st);
        }
        if(min>=0) return 1;
        else return 1-min;
    }
}