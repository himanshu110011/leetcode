class Solution {
    public int[][] merge(int[][] intervals) {
       ArrayList <int[]> list = new ArrayList<>();
       Arrays.sort(intervals, Comparator.comparingDouble(o -> o[0]));
       int prev[] = intervals[0];

       for(int i=1; i<intervals.length; i++){
        if(prev[1] >= intervals[i][0]){
            prev[1] = Math.max(prev[1], intervals[i][1]);
        }
        else{
            list.add(prev);
            prev = intervals[i];
        }
       }
       list.add(prev);
       return list.toArray(new int[list.size()][]);
    }
}