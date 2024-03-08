import java.util.HashMap;

public class Solution {
    public static int getLongestZeroSumSubarrayLength(int []arr){
        // Write your code here.
        int n = arr.length;

        HashMap<Integer, Integer> m = new HashMap<>();

        int max = 0;
        int sum = 0;

        for(int i = 0; i < n; i++){
            sum += arr[i];
            if(sum == 0){
                max = i + 1;
            }
            else{
                if(m.get(sum) != null){
                    max = Math.max(max, i - m.get(sum));
                }
                else{
                    m.put(sum, i);
                }
            }
        }
        return max;
    }
}
