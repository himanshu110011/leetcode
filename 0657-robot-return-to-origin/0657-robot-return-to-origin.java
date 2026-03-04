class Solution {
    public boolean judgeCircle(String moves) {
        int x=0;
        int y=0;
        for(int i=0;i<moves.length();i++){
            char c1=moves.charAt(i);
            if(c1=='U') x++;
            if(c1=='R') y++;
            if(c1=='D') x--;
            if(c1=='L') y--;
        }
        if(x==0 && y==0) return true;
        else return false;
    }
}