class Solution {

    public int lowerBound(int[] nums, int x){
        int n = nums.length;
        int low = 0;
        int high = n - 1;
        int ans = n;

        while(low <= high){
            int mid = (low + high)/2;
            if(nums[mid] >= x){
                ans = mid;
                high = mid - 1;
            }else
                low = mid + 1;
        }
        return ans;
    }

    public int upperBound(int[] nums, int x){
        int n = nums.length;
        int low = 0, high = n - 1;
        int ans = n;
        

        while(low <= high){
            int mid = (low + high)/2;
            if(nums[mid] > x){
                ans = mid;
                high = mid - 1;
            }else
                low = mid + 1;
        }
        return ans;
    }

    public int[] searchRange(int[] nums, int target) {
        
        int a = lowerBound(nums, target);
        int b = upperBound(nums, target) - 1;
        if(a == nums.length || nums[a] != target){
            return new int[]{-1,-1};
        }
        

        return new int[]{a,b};
        
    }
}
