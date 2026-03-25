class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int n=words.length;
        int valid[]=new int[words.length];
        for(int i = 0; i < n; i++) {
            String s = words[i];
         if((s.charAt(0)=='a' || s.charAt(0)=='e' ||s.charAt(0)=='i' ||s.charAt(0)=='o' ||s.charAt(0)=='u' )&& (s.charAt(s.length()-1)=='a'|| s.charAt(s.length()-1)=='e'||s.charAt(s.length()-1)=='i'||s.charAt(s.length()-1)=='o'||s.charAt(s.length()-1)=='u') ) valid[i]=1;
        }
         int prefix[]=new int[n];
        prefix[0]=valid[0];
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+valid[i];
        }
        int res[]=new int[queries.length];
         for(int i = 0; i < queries.length; i++) {
            int l = queries[i][0];
            int r = queries[i][1];
            if(l==0) res[i]=prefix[r];
            else res[i] = prefix[r] - prefix[l-1];
         }
         return res;

    }
}