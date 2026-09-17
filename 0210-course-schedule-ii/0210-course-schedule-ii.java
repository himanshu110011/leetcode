class Solution {
    public int[] findOrder(int n, int[][] p) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0; i<n; i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0; i<p.length; i++){
            int u = p[i][1];
            int v = p[i][0];

            adj.get(u).add(v);
        }
        int state[] = new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i=0; i<n; i++){
            if(state[i] == 0){
                if(dfs(i, state, adj, st) == true){
                    return new int[]{};
                }
            }
        }
        int[] res = new int[n];
        int i = 0;
        while(!st.isEmpty()){
            res[i++] = st.pop();
        }
        return res;
    }
    public boolean dfs(int s, int[] state, ArrayList<ArrayList<Integer>> adj, Stack<Integer> st){
        state[s] = 1;
        for(int nbr: adj.get(s)){
            if(state[nbr] == 0){
               if( dfs(nbr, state, adj, st) == true){
                return true;
               }
               
            }
            else if(state[nbr] == 1) return true;
        }
        state[s] = 2;
        st.push(s);
        return false;
    }
}