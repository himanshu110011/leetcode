class Solution {
    public int minOperations(int[] nums, int x) {
    int total=0;
       for(int n:nums){
        total+=n;
       }
       int t=total-x;
       if (t < 0) return -1;
        if (t == 0) return nums.length;
       int left=0;
       int sum=0;
       int max=-1;
       for(int right=0;right<nums.length;right++){
         sum+=nums[right];
         while(sum>t){
            sum-=nums[left];
            left++;
         }
         if (sum==t){
           max= Math.max(max,right-left+1);
         }
       }
       if(max==-1) return -1;
       else return nums.length-max;
    }
}