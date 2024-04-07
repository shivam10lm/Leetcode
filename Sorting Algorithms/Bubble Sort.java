
public class Solution {
        public static void swap(int[] arr, int a, int b){
            int temp = arr[b];
            arr[b] = arr[a];
            arr[a] = temp;
        }
        public static void bubbleSort(int[] arr, int n) {
        //Your code goes here
        int didSwap = 0;
        for(int i = n - 1; i >= 0; i--){
            for(int j = 0; j<= i - 1; j++){
                if(arr[j] > arr[j+ 1]){
                    swap(arr, j, j+1);
                    didSwap = 1;
                }
                
            }
            if(didSwap == 0)
                    break;
        }
    }

}
