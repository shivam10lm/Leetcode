class Solution {
    public int maxE(int[] nums){
        int max = 0;
        for(int i = 0; i < nums.length; i++){
            max = Math.max(max, nums[i]);
        }
        return max;
    }

    public int submission(int[] nums, int mid){
        int ans = 0;
        for(int i = 0; i < nums.length; i++){
            ans += Math.ceil((double)nums[i]/(double)mid);
        }
        return ans;
    }

    public int smallestDivisor(int[] nums, int threshold) {
        int n = nums.length;
        int low = 1;
        int high = maxE(nums);

        while(low <= high){
            int mid = (low + high)/2;
            int sum = submission(nums, mid);
            if(sum <= threshold){
                high = mid - 1;
            }else
                low = mid + 1;
            }
        
        return low;
    }
}
