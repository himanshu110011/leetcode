class Solution {
    public void reverseString(char[] s) {
        helper(s, 0);
    }
    public void helper(char[] s, int i){
        if(i >= s.length/2) return;
        char temp = s[i];
        s[i] = s[s.length-i-1];
        s[s.length-i-1] = temp;

        helper(s, i+1);
    }
}