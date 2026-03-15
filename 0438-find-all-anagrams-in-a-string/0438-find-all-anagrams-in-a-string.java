class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        char[] b = p.toCharArray();
        Arrays.sort(b);
        ArrayList<Integer> l=new ArrayList<>();
        for(int i=0;i<=s.length()-p.length();i++){
           String  st=s.substring(i,i+p.length());
            char[] a=st.toCharArray();
            Arrays.sort(a);
            if(Arrays.equals(a,b)) l.add(i);
        }
        return l; 
    }
}