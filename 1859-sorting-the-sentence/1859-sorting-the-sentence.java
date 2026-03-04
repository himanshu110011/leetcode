class Solution {
    public String sortSentence(String s) {
        String str[]=s.split(" ");
        String ans[]=new String[str.length];
        for(String st:str){
            int l=st.length();
            int p=st.charAt(l-1)-'0';
            String word =st.substring(0,l-1);
            ans[p-1]=word;
        }
        StringBuilder res=new StringBuilder();
        for(int i=0;i<ans.length;i++){
            res.append(ans[i]);
            if(i!=ans.length-1){
                res.append(" ");
            }
        }
        return res.toString();
    }
}