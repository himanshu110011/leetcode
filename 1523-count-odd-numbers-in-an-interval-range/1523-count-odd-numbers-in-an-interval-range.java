class Solution {
    public int countOdds(int low, int high) {
        int m = (high + 1) / 2;
        int n = low / 2;
        return m - n;
    }
}