class Solution {
    public int firstMissingPositive(int[] nums) {
       int i=0;
        /// for sorting using cyclic sort
        while(i<nums.length)
        {
            if (nums[i]>0 && nums[i]<nums.length && nums[i]!=nums[nums[i]-1])          // it is good to make a separate function for swapping
            {
                int temp=nums[i];
                nums[i]=nums[nums[i]-1];
                nums[temp-1]=temp;
            }
            else
            {
                i++;
            }
        }

        // finding missing positive number
        // it means nums[0]=1,nums[1]=2, ....
        for (int j=0;j<nums.length;j++)
        {
            if (nums[j]!=j+1)
            {
                return j+1;
            }
        }
        return nums.length+1;
    }
}
