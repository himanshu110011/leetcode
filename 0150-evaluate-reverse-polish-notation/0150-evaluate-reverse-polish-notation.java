class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        for(String c:tokens){
            
            if(c.equals("+") || c.equals("-") || c.equals("*")  || c.equals("/")){
                int b=st.pop();
                int a=st.pop();
                if(c.equals("+")){
                    st.push(a+b);
                }else if(c.equals("-")){
                    st.push(a-b);
                }else if(c.equals("*")){
                    st.push(a*b);
                }else st.push(a/b);
            }
            else{
                st.push(Integer.parseInt(c));
            }
        }
        return st.peek();

    }
}