class DSU {
    int[] parent;
    int[] rank;

    DSU(int n) {
        parent = new int[n+1];
        rank = new int[n+1];

        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
    }

    int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }

    boolean union(int a, int b) {
        int rootA = find(a);
        int rootB = find(b);

        if (rootA == rootB)
            return false;

        if (rank[rootA] > rank[rootB])
            parent[rootB] = rootA;

        else if (rank[rootB] > rank[rootA])
            parent[rootA] = rootB;

        else {
            parent[rootB] = rootA;

            rank[rootA]++;
        }
        return true;
    }
}

class Solution {
    public int[] findRedundantConnection(int[][] edges) {
         int n = edges.length;
        DSU dsu = new DSU(n);
         for(int[] edge : edges){
            int u = edge[0];
            int v = edge[1];

            if(!dsu.union(u, v)){
                return edge;
            }
         }
         return new int[0];
    }
}