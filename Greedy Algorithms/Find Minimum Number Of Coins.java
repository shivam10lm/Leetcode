import java.util.List;
import java.util.*;
public class Solution {
    public static List<Integer> MinimumCoins(int n) {
        // Write your code here.
        ArrayList<Integer> ans = new ArrayList<>();

        int[] coins = {1,2,5,10,20,50,100,500,1000};
        int x = coins.length;

        for(int i = x - 1; i >= 0; i--){
            while(n >= coins[i]){
                n -= coins[i];
                ans.add(coins[i]);
            }
        }
        return ans;
    }
}
