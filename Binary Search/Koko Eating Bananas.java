class Solution {

    public int maxElement(int[] piles){
        int max = 0;
        for(int i = 0; i < piles.length; i++){
            max = Math.max(max, piles[i]);
        }
        return max;
    }

    public int totalHours(int[] piles, int hourly){
        int totalH = 0;

        for(int i = 0; i < piles.length; i++){
            totalH += Math.ceil((double)piles[i]/(double)hourly);
        } 
        return totalH;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int low = 1;
        int high = maxElement(piles);

        while(low <= high){
            int mid = (low + high)/2;
            int total = totalHours(piles, mid);
            if(total <= h){
                high = mid - 1;
            }else
                low = mid + 1;

        }
        return low;
    }
}
