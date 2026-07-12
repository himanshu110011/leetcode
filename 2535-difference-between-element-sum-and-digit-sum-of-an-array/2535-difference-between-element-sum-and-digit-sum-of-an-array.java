class Solution {
    public int differenceOfSum(int[] nums) {
        int eleSum = 0;
        int digSum = 0;
        for( int i : nums){
            eleSum += i;
            while(i != 0){
                int r = i%10;
                i = i/10;
                digSum += r;
            }
        }
        return Math.abs(digSum - eleSum);
    }
}