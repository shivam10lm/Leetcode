import java.util.HashMap;

public class Solution {
    public static int subarraysWithSumK(int []a, int b) {
        // Write your code here
        int xr = 0;
        int n = a.length;

        HashMap<Integer, Integer> mpp = new HashMap<>();

        mpp.put(xr, 1);
        int count = 0;

        for(int i = 0; i < n; i++){
            xr = xr ^ a[i];

            int x = xr ^ b;

            if(mpp.containsKey(x)){
                count += mpp.get(x);
            }
            if(mpp.containsKey(xr)){
                mpp.put(xr, mpp.get(xr) + 1);
            }else
                mpp.put(xr, 1);
        }
        return count;
    }
}
