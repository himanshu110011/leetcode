class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m[] = new int[nums1.length + nums2.length];
        for (int i = 0; i < nums1.length; i++) {
            m[i] = nums1[i];
        }
        for (int i = 0; i < nums2.length; i++) {
            m[nums1.length + i] = nums2[i];
        }
        Arrays.sort(m);
        double mid;
        int n = m.length;
        if (n % 2 == 1) {
            return (float) m[n / 2];
        } else {
            int s = n / 2;
            int e = (n / 2) - 1;
            mid = (m[s] + m[e]) / 2.0;
            return mid;

        }

    }
}
