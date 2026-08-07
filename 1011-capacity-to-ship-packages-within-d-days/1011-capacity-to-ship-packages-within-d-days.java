class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = 0;
        int high = 0;
        for(int weight : weights){
            if(weight>low) low = weight;
            high += weight;
        }
        while(low < high){
            int mid = low + (high - low)/2;
        if(canShip(weights, days, mid)) high = mid;
        else low = mid+1;
        }
        return low;
    }
    public boolean canShip(int[] weights, int days,  int capacity){
         int currentDays = 1;
            int currentWeight = 0;
        
        for (int weight : weights) {
            if (currentWeight + weight > capacity) {
                currentDays++;
                currentWeight = 0;
            }
            currentWeight += weight;
        }
        return currentDays <= days;
    }
}