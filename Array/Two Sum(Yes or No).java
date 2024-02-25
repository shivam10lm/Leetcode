import java.util.*;
public class Solution {
    public static String read(int n, int []book, int target){
        // Write your code here.

        int left = 0, right = n - 1;
        Arrays.sort(book);

        while(left < right){
            int sum = book[left] + book[right];
            if(sum == target){
                return "YES";
            }
            else if(sum > target){
                right--;
            }
            else if(sum < target){
                left++;
            }
        }
        return "NO";
    }
}
