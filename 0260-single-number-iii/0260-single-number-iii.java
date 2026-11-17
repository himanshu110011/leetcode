class Solution {
    public int[] singleNumber(int[] nums) {
        int xor = 0;
        for(int i : nums){
            xor = xor ^ i;
        }
        int bit = xor & -xor;

        int a = 0;
        int b = 0;
        for(int n :  nums){
            if((bit & n) != 0) a ^= n;
            else b ^= n;
        }
        return new int[]{a, b};
    }
}