import java.util.*;
public class Solution {
    public static List< Integer > superiorElements(int []a) {
        // Write your code here.
        int n = a.length;
        ArrayList<Integer> ans = new ArrayList<>();
        int max = a[n - 1];

        ans.add(a[n-1]);
    
    // Start checking from the end whether a number is greater
    // than max no. from right, hence leader.
    for (int i = n - 2; i >= 0; i--)
      if (a[i] > max) {
        ans.add(a[i]);
        max = a[i];
      }

  return ans;

    }
}
