class Solution {
    public int calPoints(String[] operations) {
        Stack <Integer> st=new Stack<>();
        for( String s:operations){
            if(s.equals("+")){
                int a=st.pop();
                int b=st.peek();
                st.push(a);
                st.push(a+b);
            }else if(s.equals("C")){
              st.pop();
            }
            else if(s.equals("D")){
                int a=st.pop();
                st.push(a);
                st.push(a*2);
            }else st.push(Integer.parseInt(s));
        }
        int sum=0;
        for(int i:st){
         sum=sum+i;
        }
        return sum;
    }
}