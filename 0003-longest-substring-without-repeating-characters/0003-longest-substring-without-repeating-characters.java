class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int max = 0;
    
        int[] arr = new int[128]; 

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
           
            arr[ch]++; 

            while (arr[ch] > 1) {
                char leftch = s.charAt(left);
                arr[leftch]--;
                left++;
            }

            
            max = Math.max(max, right - left + 1);
        }

        return max;
    }
}
