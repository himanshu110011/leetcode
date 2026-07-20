class Solution {
    public int missingNumber(int[] nums) {
    //   int n=nums.length;
    //   int sum=n*(n+1)/2;
    //   int asum=0;
    //   for(int i:nums){
    //     asum+=i;
    //   }
    //   return sum-asum;

    int xor = nums.length;
    for(int i=0; i<nums.length; i++){
        xor = xor ^ i;
        xor = xor ^ nums[i];
    }
    return xor;
    }

}