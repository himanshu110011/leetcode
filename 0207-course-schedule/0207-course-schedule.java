class Solution {
    public boolean canFinish(int n, int[][] p) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i=0; i<n; i++){
            adj.add(new ArrayList<>());
        }

        for(int i=0; i<p.length; i++){
            int u = p[i][1];
            int v = p[i][0];

            adj.get(u).add(v);
        }

        int[] state = new int[n];

        for(int i=0; i<n; i++){
            if(state[i] == 0){
                if(dfs(i, state, adj)){
                    return false;
                }
            }
        }
        return true;
    }

    public boolean dfs(int i, int[] state, ArrayList<ArrayList<Integer>> adj){
        state[i] = 1;

        for(int nbr: adj.get(i)){
            if(state[nbr] == 0){
                if(dfs(nbr, state, adj)==true){
                    return true;
                }
            }
            else if(state[nbr] == 1) return true;
        }

        state[i] = 2;
        return false;
    }
}