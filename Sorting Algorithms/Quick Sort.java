public class Solution {
   

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;

        while (i < j) {
            while (arr[i] <= pivot && i <= high - 1) {
                i++;
            }

            while (arr[j] > pivot && j >= low + 1) {
                j--;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        return j;
    }

	 public static void quickSort(int[] input, int startIndex, int endIndex) {
        if (startIndex < endIndex) {
            int pIndex = partition(input, startIndex, endIndex);
            quickSort(input, startIndex, pIndex - 1);
            quickSort(input, pIndex + 1, endIndex);
        }
    }
}
