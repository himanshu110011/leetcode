class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='#') {
               if(!st.isEmpty()) st.pop();
            }
            else st.push(c);
        }
        Stack<Character> ts=new Stack<>();
        for(int i=0;i<t.length();i++){
            char c=t.charAt(i);
            if(c=='#'){
              if(!ts.isEmpty()) ts.pop();
            } 
            else ts.push(c);
        }
        return st.equals(ts);
    }
}