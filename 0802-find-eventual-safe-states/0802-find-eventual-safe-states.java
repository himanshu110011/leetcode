class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int[] state = new int[graph.length];
        List<Integer> ans = new ArrayList<>();

        for(int i=0; i<graph.length; i++){
            if(dfs(graph, state, i)){
                ans.add(i);
            }
        }
        return ans;
    }
    public boolean dfs(int[][] graph, int[] state, int node){
        if(state[node] == 1) return false;

        if(state[node] == 2) return true;

        state[node] = 1;

        for(int nbr : graph[node]){
            if(!dfs(graph, state, nbr)) 
            return false;
        }

        state[node] = 2;
        return true;
    }
}