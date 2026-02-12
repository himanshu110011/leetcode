class Solution {
    public int reverseBits(int n) {
        int org = 0;
        for (int i = 0; i < 32; i++) {
            int r = n % 2;
            n = n / 2;
            org = org * 2 + r;
        }
        return org;
    }
}
