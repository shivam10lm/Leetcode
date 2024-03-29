import java.util.ArrayList;
import java.util.*;

public class Solution 
{
    public static int maxE(ArrayList<Integer> boards){
        int max = 0;
        for(int i = 0; i < boards.size(); i++){
            max = Math.max(max, boards.get(i));
        }
        return max;
        
    }

    public static int submission(ArrayList<Integer> boards){
        int ans = 0;
        for(int i = 0; i < boards.size(); i++){
            ans += boards.get(i);
        }
        return ans;
    }

    public static int painters(ArrayList<Integer> boards, int k){
        int painter = 1;
        long units = 0;
        for(int i = 0; i < boards.size(); i++){
            if(units + boards.get(i) <= k){
                units += boards.get(i);
            }else{
                painter++;
                units = boards.get(i);
            }
        }
        return painter;
    }
    public static int findLargestMinDistance(ArrayList<Integer> boards, int k)
    {
        //    Write your code here.
        int low = maxE(boards);
        int high = submission(boards);
      

        while(low <= high){
            int mid = (low + high)/2;
            int noOfPainters = painters(boards, mid);
            if(noOfPainters > k)
                low = mid + 1;
            else
                high = mid - 1;
             }
             return low;
    }
}
