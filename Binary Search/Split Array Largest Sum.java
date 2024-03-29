class Solution {
    public int maxE(int[] nums){
        int max = 0;
        for(int i = 0; i < nums.length; i++){
            max = Math.max(max, nums[i]);
        }
        return max;
    }

    public int submission(int[] nums){
        int ans = 0;
        for(int i = 0; i < nums.length; i++){
            ans += nums[i];
        }
        return ans;
    }

    public int largestSum(int[] nums, int k){
        int number = 1;
        long sum = 0;
        for(int i = 0; i < nums.length; i++){
            if(sum + nums[i] <= k){
                sum += nums[i];
            }else{
                number++;
                sum = nums[i];
            }
        }
        return number;
    }

    public int splitArray(int[] nums, int k) {
        int low = maxE(nums);
        int high = submission(nums);

        while(low <= high){
            int mid = (low + high)/2;
            int largestNumber = largestSum(nums, mid);
            if(largestNumber <= k)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return low;
    }
}
