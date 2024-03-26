class Solution {

    public int maxE(int[] a){
        int max = 0;
        for(int i = 0; i < a.length; i++){
            max = Math.max(max, a[i]);
        }
        return max;
    }

    public int submission(int[] a){
        int ans = 0;
        for(int i = 0; i < a.length; i++){
            ans += a[i];
        }
        return ans;
    }

    public int weightPerDay(int[] weights, int capacity){
        int days = 1, load = 0;

        for(int i = 0; i < weights.length; i++){
            if(load + weights[i] > capacity){
                days = days + 1;
                load = weights[i];
            }
            else
                load += weights[i];
        }
        return days;
    }

    public int shipWithinDays(int[] weights, int days) {
        int low = maxE(weights);
        int high = submission(weights);

        while(low <= high){
            int mid = (low + high)/2;
            int noOfDays = weightPerDay(weights, mid);

            if(noOfDays <= days)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return low;
    }
}
