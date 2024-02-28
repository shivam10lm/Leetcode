class Solution {

    public void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public void rev(int[] nums, int start, int end){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public void nextPermutation(int[] nums) {
        int index = -1;

        for(int i = nums.length - 2; i >= 0; i--){
            if(nums[i] < nums[i+1]){
                index = i;
                break;
            }
        }
        if(index == -1){
            rev(nums, 0, nums.length - 1);
            return;
        }

        for(int i = nums.length - 1; i >= index; i--){
            if(nums[i] > nums[index]){
                swap(nums, i, index);
                break;
            }
        }
        rev(nums, index + 1, nums.length - 1);
    }
}
