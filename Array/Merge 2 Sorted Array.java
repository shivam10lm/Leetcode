import java.util.*;
public class Solution {
    public static List< Integer > sortedArray(int []a, int []b) {
        // Write your code here
        int i = 0, j = 0;
        int n = a.length;
        int m = b.length;
        ArrayList<Integer> union = new ArrayList<>();

        while(i<n && j<m){
            if(a[i] <= b[j]){
                if(union.size() == 0 || union.get(union.size() - 1) != a[i]){
                    union.add(a[i]);
                }
                i++;
            }else{
                if(union.size() == 0 || union.get(union.size() - 1) != b[j]){
                    union.add(b[j]);
                }
                j++;
            }
        }
        while(i < n){
                    if(union.size() == 0 || union.get(union.size() - 1) != a[i]){
                    union.add(a[i]);
                }
                i++;
        }
        while(j < m){
                    if(union.size() == 0 || union.get(union.size() - 1) != b[j]){
                    union.add(b[j]);
                }
                j++;
        }
        return union;
    }
}
