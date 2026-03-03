class Solution {
    public String sortSentence(String s) {
        String str[]=s.split(" ");
        String ans[]=new String[str.length];
        for(String st : str){
            int len=st.length();
            int p=st.charAt(len-1)-'0';
            String word=st.substring(0,len-1);
            ans[p-1]=word;
        }
    StringBuilder result = new StringBuilder();
     for (int i = 0; i < ans.length; i++) {
            result.append(ans[i]);
            if (i != ans.length - 1) {
                result.append(" ");
            }
        }
        return result.toString();
    }
}