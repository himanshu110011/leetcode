class DSU {
    int[] parent;
    int[] rank;

    DSU(int n) {
        parent = new int[n];
        rank = new int[n];

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

        if (rootA == rootB) {
            return false;
        }

        if (rank[rootA] > rank[rootB]) {
            parent[rootB] = rootA;
        } else if (rank[rootB] > rank[rootA]) {
            parent[rootA] = rootB;
        } else {
            parent[rootB] = rootA;
            rank[rootA]++;
        }

        return true;
    }
}
class Solution {
    public int minCostConnectPoints(int[][] points) {
       int n = points.length;
        DSU dsu = new DSU(n);

        int[][] edges = new int[n * (n - 1) / 2][3];
        int idx = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int weight = Math.abs(points[i][0] - points[j][0])
                           + Math.abs(points[i][1] - points[j][1]);

                edges[idx++] = new int[]{i, j, weight};
            }
        }
        Arrays.sort(edges, (a, b) -> Integer.compare(a[2], b[2]));

        int mstWeight = 0;
        int edgeCount = 0;

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            int weight = edge[2];

            if (dsu.union(u, v)) {
                mstWeight += weight;
                edgeCount++;

                if (edgeCount == n -1 ) {
                    break;
                }
            }
        }

        return mstWeight;
    }
}