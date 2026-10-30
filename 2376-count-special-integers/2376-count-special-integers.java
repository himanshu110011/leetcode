
class Solution {
    int[][][] dp;

    public int countSpecialNumbers(int n) {
        String s = String.valueOf(n);
        int len = s.length();

        dp = new int[len][1 << 10][2];

        for (int[][] a : dp) {
            for (int[] b : a) {
                Arrays.fill(b, -1);
            }
        }

        return solve(0, 0, 1, 0, s);
    }

    int solve(int idx, int mask, int tight, int started, String s) {

        if (idx == s.length()) {
            return started == 1 ? 1 : 0;
        }

        if (started == 1 && tight == 0 &&
            dp[idx][mask][1] != -1) {
            return dp[idx][mask][1];
        }

        int limit = (tight == 1) ? s.charAt(idx) - '0' : 9;

        int ans = 0;

        for (int digit = 0; digit <= limit; digit++) {

            int newTight = (tight == 1 && digit == limit) ? 1 : 0;

            if (started == 0 && digit == 0) {
                ans += solve(idx + 1, mask, newTight, 0, s);
            } 
            else {
                if ((mask & (1 << digit)) == 0) {
                    ans += solve(
                        idx + 1,
                        mask | (1 << digit),
                        newTight,
                        1,
                        s
                    );
                }
            }
        }

        if (started == 1 && tight == 0) {
            dp[idx][mask][1] = ans;
        }

        return ans;
    }
}
