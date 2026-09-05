class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Queue<Integer> que =  new ArrayDeque<>();
        boolean vis[] = new boolean[rooms.size()];

        vis[0] = true;
        que.offer(0);

        while(!que.isEmpty()){
            int curr = que.poll();

            for(int key : rooms.get(curr)){
                if(!vis[key]){
                    vis[key] = true;
                    que.offer(key);
                }
            }
        }
        for(boolean v : vis){
            if(!v) return false;
        }
        return true;
    }
}