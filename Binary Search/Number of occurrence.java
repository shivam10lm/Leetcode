public class Solution {
    public static int lowerBound(int[] nums, int n, int x){
        int low = 0;
        int high = n - 1;
        int ans = n;

        while(low <= high){
            int mid = (low + high)/2;
            if(nums[mid] >= x){
                ans = mid;
                high = mid - 1;
            }else
                low = mid + 1;
        }
        return ans;
    }

    public static int upperBound(int[] nums, int n, int x){
        int low = 0, high = n - 1;
        int ans = n;
        

        while(low <= high){
            int mid = (low + high)/2;
            if(nums[mid] > x){
                ans = mid;
                high = mid - 1;
            }else
                low = mid + 1;
        }
        return ans;
    }
    public static int count(int arr[], int n, int x) {
        //Your code goes here
        int a  = lowerBound(arr, n, x);
        int b = upperBound(arr, n, x);

        return ((b - a));
    }
}
