import java.util.ArrayList;
public class Solution {

    public static int maxE(ArrayList<Integer> arr){
        int max = 0;
        for(int i = 0; i < arr.size(); i++){
            max = Math.max(max, arr.get(i));
        }
        return max;
    }

    public static int submission(ArrayList<Integer> arr){
        int ans = 0;
        for(int i = 0; i < arr.size(); i++){
            ans += arr.get(i);
        }
        return ans;
    }
    public static int noStudents(ArrayList<Integer> arr, int pages){
        int student = 1;
        long pagesStudent = 0;

        for(int i = 0; i < arr.size(); i++){
            if(pagesStudent + arr.get(i) <= pages){
                pagesStudent += arr.get(i);
            }else{
                student++;
                pagesStudent = arr.get(i);
            }
        }
        return student;
    }

    public static int findPages(ArrayList<Integer> arr, int n, int m) {
        // Write your code here.
        if(m > n) return -1;
        int low = maxE(arr);
        int high = submission(arr);

        while(low <= high){
            int mid = (low + high)/2;
            int students = noStudents(arr, mid);
            if(students > m)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return low;
    }
}
