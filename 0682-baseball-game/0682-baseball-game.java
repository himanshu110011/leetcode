class Solution {
    public int calPoints(String[] op) {
        Stack <Integer> st=new Stack<>();
        for(String o:op){
            if(o.equals("+")){
                int a=st.pop();
                int b=st.peek();
                int sum=a+b;
                st.push(a);
                st.push(sum);
            }
           else  if(o.equals("D")){
                int a=st.pop();
                int d=a*2;
                st.push(a);
                st.push(d);

            }
           else  if(o.equals("C")){
                st.pop();
            }
            else st.push(Integer.parseInt(o));
        }
        int sum=0;
        for(int s:st){
            sum+=s;
        }
        return sum;
    }
}