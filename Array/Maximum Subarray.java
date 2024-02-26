class Solution {
    public int maxSubArray(int[] nums) {
        
        int sum = 0;
        int max_sum = nums[0];

        for(int i = 0; i < nums.length; i++){
            if(sum < 0){
                sum = 0;
            }
            sum += nums[i];
            if(sum > max_sum){
                max_sum = sum;
            }
        }
        return max_sum;
    }
}
