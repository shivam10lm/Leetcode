class Solution {

    public long merger(int[] a, int low, int mid, int high){
        int left = low, right = mid + 1;
        long count = 0;

        ArrayList<Integer> temp = new ArrayList<>();

        while(left <= mid && right <= high){
            if(a[left] <= a[right]){
                temp.add(a[left]);
                left++;
            }else{
                temp.add(a[right]);
                count += (mid - left + 1);
                right++;
            }
        }

        while(left <= mid){
            temp.add(a[left]);
            left++;
        }
        while(right <= high){
            temp.add(a[right]);
            right++;
        }

        for(int i = low; i <= high; i++){
            a[i] = temp.get(i - low);
        }
        return count;
    }

    public long mergeSort(int[] a, int low, int high){
        long count = 0;
        if(low >= high) return count;

        int mid = (low + high)/2;
        count += mergeSort(a, low, mid);
        count += mergeSort(a, mid+1, high);
        count += merger(a, low, mid, high);

        return count;
    }

    public long numberOfInversions(int[] nums) {
        int n = nums.length;
        return mergeSort(nums, 0, n -1);
    }
}
