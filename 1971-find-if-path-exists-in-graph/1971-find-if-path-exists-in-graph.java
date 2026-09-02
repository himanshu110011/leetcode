class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> list = new ArrayList<>();

        for(int i=0; i<n; i++){
            list.add(new ArrayList<>());
        }

        for(int[] edge : edges){
            int u = edge[0];
            int v = edge[1];
            
            list.get(u).add(v);
            list.get(v).add(u);
        }

        Queue<Integer> que  = new ArrayDeque<>();
        boolean[] vis = new boolean[list.size()];
        vis[source] = true;
        que.offer(source);

        while(!que.isEmpty()){
            int curr = que.poll();
             if (curr == destination) {
                return true;
            }
            for(int nbr :  list.get(curr)){
                if(!vis[nbr]){
                 vis[nbr] = true;
                que.offer(nbr);
                }
            }
        }
        return false;
    }
}