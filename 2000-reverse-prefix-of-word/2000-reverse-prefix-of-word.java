class Solution {
    public String reversePrefix(String word, char ch) {
        String st="";
        int n=word.indexOf(ch);
        for(int i=n;i>=0;i--){
        st=st+word.charAt(i);
        }
        for( int i=n+1;i<word.length();i++){
            st=st+word.charAt(i);
        }
        return st;
    }
}