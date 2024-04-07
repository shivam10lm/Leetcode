public class Solution {
    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static void insertionSort(int[] arr, int size) {
        //Your code goes here
        for(int i = 0; i <= size - 1; i++){
            int j = i;
            while(j > 0 && arr[j - 1] > arr[j]){
                swap(arr, j - 1, j);
                j--;
            }
        }
    }
}
