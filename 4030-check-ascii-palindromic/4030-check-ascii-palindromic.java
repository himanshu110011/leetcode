class Solution {
    public boolean isPalindromic(String s) {
        String st = "";
        for(char ch : s.toCharArray()){
        int ascii = ch;
        String binary = String.format("%8s", Integer.toBinaryString(ascii))
                           .replace(' ', '0');

        st += binary;
        }
        String rev = new StringBuilder(st).reverse().toString();
        if(st.equals(rev))  return true;
        else return false;
        
    }
}