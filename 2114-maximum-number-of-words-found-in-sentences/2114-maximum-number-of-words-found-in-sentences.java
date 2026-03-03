class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxc=0;
        for(String s:sentences){
          s=s.trim();
          String[] str=s.split(" ");
          int c=str.length;
          if(c>maxc)maxc=c;
        }
        return maxc;
    }
}