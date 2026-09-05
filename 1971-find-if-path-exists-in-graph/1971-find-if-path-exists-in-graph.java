class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i=0; i<n; i++){
            adj.add(new ArrayList<>());
        }

        for(int edge[] : edges){
            int u = edge[0];
            int v = edge[1];

            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        
        boolean vis[] = new boolean[adj.size()];
        Queue<Integer> que = new ArrayDeque<>();

        vis[source] = true;
        que.offer(source);

        while(!que.isEmpty()){
            int curr = que.poll();

            if(curr == destination) return true;

            for(int neigh : adj.get(curr)){
                if(!vis[neigh]){
                    vis[neigh] = true;
                    que.offer(neigh);
                }
            }
        }
        return false;
    }
}