import java.util.*;

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>(); // store index
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && temperatures[i] > temperatures[st.peek()]) {
                int prevIndex = st.pop();
                ans[prevIndex] = i - prevIndex;
            }
            st.push(i);
        }
        return ans;
    }
}