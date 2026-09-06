class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0; i<isConnected.length; i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0; i<isConnected.length; i++){
            for(int j=0; j<isConnected[0].length; j++){
                if (isConnected[i][j] == 1) {
                    adj.get(i).add(j);
                }
            }
        }

        boolean[] visited = new boolean[n];
        int provinces = 0;
         for (int i = 0; i < n; i++) {

            if (!visited[i]) {
                provinces++;
                dfs(i, adj, visited);
            }
        }

        return provinces;
    }

    public void dfs(int node,
                    ArrayList<ArrayList<Integer>> adj,
                    boolean[] visited) {

        visited[node] = true;

        for (int neighbour : adj.get(node)) {

            if (!visited[neighbour]) {
                dfs(neighbour, adj, visited);
            }
        }
    }
}