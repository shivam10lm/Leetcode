class Solution {
    public List<Integer> majorityElement(int[] nums) {
       ArrayList<Integer> ans = new ArrayList<>();
       int n = nums.length;
       int count1 = 0, count2 = 0;
       int elm1 = Integer.MIN_VALUE, elm2 = Integer.MIN_VALUE;

       for(int i = 0; i < n; i++){
           if(count1 == 0 && nums[i] != elm2){
               count1 = 1;
               elm1 = nums[i];
           }
           else if(count2 == 0 && nums[i] != elm1){
               count2 = 1;
               elm2 = nums[i];
           }
           else if(elm1 == nums[i]){
               count1++;
           }
           else if(elm2 == nums[i]){
               count2++;
           }
           else{
               count1--;
               count2--;
           }
       }
        count1 = 0;
        count2 = 0;

        for(int i = 0; i < n; i++){
            if(nums[i] == elm1){
                count1++;
            }else if(nums[i] == elm2){
                count2++;
            }
        }
    int min = n/3 + 1;

    if(count1 >= min){
        ans.add(elm1);
    }
    if(count2 >= min){
        ans.add(elm2);
    }
        return ans;
    }
}
