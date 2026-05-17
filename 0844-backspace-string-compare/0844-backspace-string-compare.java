class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack <Character> st=new Stack<>();
        Stack <Character> ts=new Stack<>();
       for(char ch:s.toCharArray()){
        if(ch=='#'){
            if(!st.isEmpty())
            st.pop();
        }else st.push(ch);
       }
       for(char ch:t.toCharArray()){
        if(ch=='#'){
            if(!ts.isEmpty())
            ts.pop();
        }else ts.push(ch);
       }
       return st.equals(ts);
    }
}