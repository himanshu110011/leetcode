class Solution {
    public int nearestDrone(int[][] drones, int[] target) {
        int idx = -1;
        int min = Integer.MAX_VALUE;
        
        for (int i = 0; i < drones.length; i++) {
            int t = drones[i][2]; 
            int val = Math.abs(drones[i][0] - target[0]) + Math.abs(drones[i][1] - target[1]); 
            if (val <= t) { 
                if (val < min) {
                    min = val;
                    idx = i;
                }
            }
        }
        return idx;
    }
}
