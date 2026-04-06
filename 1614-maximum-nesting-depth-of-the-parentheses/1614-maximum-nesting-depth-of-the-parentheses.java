class Solution {
    public int maxDepth(String s) {
        Stack<Character> st=new Stack<>();
        int c=0;
        int max=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                st.push(ch);
                c++;
                max=Math.max(max,c);
            }
            else if(ch==')'){
                st.pop();
                c--;
            }
        }
        return max;
    }
}