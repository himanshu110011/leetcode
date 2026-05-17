class Solution {
    public int calPoints(String[] operations) {
        Stack <Integer> st=new Stack<>();
        for(String opr:operations){
            if(opr.equals("+")){
                int a=st.pop();
                int b=st.peek();
                st.push(a);
                st.push(a+b);
            }else if(opr.equals("C")){
                st.pop();
            }else if(opr.equals("D")){
                st.push(2*st.peek());
            }else st.push(Integer.parseInt(opr));
        }
        int sum=0;
        for(int i:st){
            sum+=i;
        }
        return sum;
    }
}