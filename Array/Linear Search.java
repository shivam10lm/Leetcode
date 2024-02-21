import java.util.*;
public class Solution {
    public static int linearSearch(int n, int num, int []arr){
        // Write your code here.
        int count = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] == num){
                count = i;
                break;
            }else{
            count = -1;
        }
        }
        
        return count;
    }
}
