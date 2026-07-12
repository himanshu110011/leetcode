class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
       int y = coordinates[1][1]-coordinates[0][1];
       int x = coordinates[1][0]-coordinates[0][0];

       for(int c[] : coordinates){
        int xi = c[0];
        int yi = c[1];
        if (y * (xi - coordinates[0][0]) != (yi - coordinates[0][1]) * x)
        return false;
       }
       return true;
    }
}