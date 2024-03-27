import java.util.Arrays;

public class Solution {

    public static boolean canWePlace(int[] stalls, int dist, int cows){
        int count = 1, last = stalls[0];
        for(int i = 0; i < stalls.length; i++){
            if(stalls[i] - last >= dist){
                count++;
                last = stalls[i];
            }
            if(count >= cows)
                return true;
        }
        return false;
    }
    public static int aggressiveCows(int []stalls, int k) {
        //    Write your code here.
        Arrays.sort(stalls);
        int n = stalls.length;
        int low = 0;
        int high = stalls[n - 1] - stalls[0];

        while(low <= high){
            int mid = (low + high)/2;
            if(canWePlace(stalls, mid, k) == true){
                low = mid + 1;
            }
            else
                high = mid - 1;
        }
        return high;
    }
}
