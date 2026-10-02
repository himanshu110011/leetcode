class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        
        solve(0, s, ans, new ArrayList<>());

        return ans;
    }
    public void solve(int idx, String s, List<List<String>> ans, List<String> list){
        if(idx == s.length()){
            ans.add(new ArrayList<>(list));
        }

        for(int i=idx; i<s.length(); ++i){
            if(isPalindrome(idx, i, s)){
                list.add(s.substring(idx, i + 1));
                solve(i + 1, s, ans, list);
                list.remove(list.size() - 1);
            }
        }
    }
    public boolean isPalindrome(int st, int end, String s){
        while(st <= end){
            if(s.charAt(st++) != s.charAt(end--)) return false;
        }
        return true;
    }
}