class Solution {
    public int minSubArrayLen(int target, int[] arr) {
        int left = 0;
        int min = Integer.MAX_VALUE;
        int sum = 0;

        for(int right=0; right<arr.length; right++){
            sum += arr[right];

            while(sum >= target){
                min =  Math.min(min, right-left+1);

                sum -= arr[left];
                left++;
            }
        }
        if(min == Integer.MAX_VALUE) return 0;
        return min;
    }
}