class Solution {

    public void merge(int[] arr, int low, int mid, int high){
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;

        while(left <= mid && right <= high){
            if(arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                right++;
            }
        }
            while(left <= mid){
                temp.add(arr[left]);
                left++;
            }
            while(right <= high){
                temp.add(arr[right]);
                right++;
            }
        for(int i = low; i <= high; i++){
            arr[i] = temp.get(i - low);
        }
    }

    public int countPairs(int[] arr, int low, int mid, int high){
        int right = mid + 1;
        int count = 0;
        for(int i = low; i <= mid; i++){
            while(right <= high && 0.5 * arr[i] > arr[right])
                right++;
            count+= (right - (mid + 1));
        }
        return count;
    }

    public int mergeSort(int[] nums, int low, int high){
        int count = 0;
        int mid = (low + high)/2;
        if(low >= high) return count;
        count += mergeSort(nums, low, mid);
        count += mergeSort(nums, mid + 1, high);
        count += countPairs(nums, low, mid, high);
        merge(nums, low, mid, high);
        return count;
    }

    public int reversePairs(int[] nums) {
        return mergeSort(nums, 0, nums.length - 1);

    }
}
