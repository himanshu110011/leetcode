class Solution {
    public int countGoodSubstrings(String s) {
        if(s.length()<3) return 0;
        String str="";
        int c=0;
       for(int i=0;i<3;i++){
        str+=s.charAt(i);
       }
       if(str.charAt(0)!=str.charAt(1) && str.charAt(1)!=str.charAt(2) && str.charAt(2)!=str.charAt(0)) c++;
       for(int i=3;i<s.length();i++){
        str+=s.charAt(i);
        str=str.substring(1);
       if(str.charAt(0)!=str.charAt(1) && str.charAt(1)!=str.charAt(2) && str.charAt(2)!=str.charAt(0)) c++;
       } 
       return c;
    }
}