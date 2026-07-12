class Solution {
    public int averageValue(int[] nums) {
        int sum = 0;
        int c = 0;
        for( int i : nums){
            if(i % 2 == 0 && i % 3 == 0){
                c++;
                sum += i; 
            }
        }
        int ans = (c==0) ? 0 : sum/c;
        return ans;
    }
}