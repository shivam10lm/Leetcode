class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        //Brute Solution - 
        // int[] ans1 = new int[(n/2)];
        // int[] ans2 = new int[(n+1/2)];
        // int index1 = 0;
        // int index2 = 0;
        // for(int i = 0; i < nums.length; i++){
        //     if(nums[i] > 0){
        //         ans1[index1] = nums[i];
        //         index1++;
        //     }
        //     else{
        //         ans2[index2] = nums[i];
        //         index2++;
        //     }
        // }

        // for(int i = 0; i < n/2; i++){
        //     nums[2*i] = ans1[i];
        //     nums[(2*i) + 1] = ans2[i];
        // }
        // return nums;

        //Optimal Solution -

        int[] ans = new int[n];

        int pos = 0;
        int neg = 1;

        for(int i = 0; i < n; i++){
            if(nums[i] > 0){
                ans[pos] = nums[i];
                pos += 2;
            }
            else{
                ans[neg] = nums[i];
                neg +=2;
            }
        }
        return ans;
    }
}
