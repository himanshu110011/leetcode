class Solution {
    public int largestAltitude(int[] gain) {
        int al=0;
        int max=0;
        for(int i=0;i<gain.length;i++){
            al+=gain[i];
            max=Math.max(al,max);
        }
        return max;
    }
}