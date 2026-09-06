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

        boolean[] vis = new boolean[n];
        Queue<Integer> que = new ArrayDeque<>();
        int provinces = 0;
        for(int i=0; i<n; i++){
            if(!vis[i]){
              provinces++;
              que.offer(i);
            }
            while(!que.isEmpty()){
                int curr = que.poll();

                for(int nbr : adj.get(curr)){
                    if(!vis[nbr]){
                        vis[nbr] = true;
                        que.offer(nbr);
                    }
                }
            }
        }
        return provinces;
    }
}