class Solution {
    public int[] getSubarrayBeauty(int[] nums, int k, int x) {
        int n = nums.length;
        int[] res = new int[n - k + 1];
        int[] freq = new int[101];

        for (int i = 0; i < n; i++) {
            freq[nums[i] + 50]++;

            if (i >= k) {
                freq[nums[i - k] + 50]--;
            }

            if (i >= k - 1) {
                int count = 0;
                int beauty = 0;

                for (int j = 0; j < 50; j++) {
                    count += freq[j];
                    if (count >= x) {
                        beauty = j - 50;
                        break;
                    }
                }
                res[i - k + 1] = beauty;
            }
        }
        return res;
    }
}