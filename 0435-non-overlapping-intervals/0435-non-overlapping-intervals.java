class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int r = 0;
        Arrays.sort(intervals, Comparator.comparingDouble(o -> o[1]));
        int lastend = intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<lastend){
                r++;
            }
            else lastend = intervals[i][1];   
        }
        return r;
    }
}