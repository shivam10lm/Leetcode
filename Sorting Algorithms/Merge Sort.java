import java.util.ArrayList;

public class Solution {

    public static void merger(int[] arr, int low, int mid, int high){
        int left = low;
        int right = mid + 1;

        ArrayList<Integer> temp = new ArrayList<>();

        while(left <= mid && right<= high){
            if(arr[left] < arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                right++;
            }
        }
        while(left<=mid){
            temp.add(arr[left]);
            left++;
        }
        while(right<=high){
            temp.add(arr[right]);
            right++;
        }
        for(int i = low; i <= high; i++){
            arr[i] = temp.get(i - low);
        }
    }

    public static void mS(int[] arr, int low, int high){
        if(low == high) return;
        int mid = (low + high)/2;
        mS(arr, low, mid);
        mS(arr, mid + 1, high);
        merger(arr, low, mid, high);
    }
    public static void mergeSort(int[] arr, int l, int r){
        // Write your code here
        mS(arr, l, r);
    }
}
