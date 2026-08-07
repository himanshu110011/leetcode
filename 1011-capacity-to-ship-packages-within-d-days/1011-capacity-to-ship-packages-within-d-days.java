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
             int currentDays = 1;
            int currentWeight = 0;
        
        for (int weight : weights) {
            if (currentWeight + weight > mid) {
                currentDays++;
                currentWeight = 0;
            }
            currentWeight += weight;
        }
        if(currentDays <=  days) high = mid;
        else low = mid+1;
        }
        return low;
    }
}