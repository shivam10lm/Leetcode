class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n == 0){
            return 0; 
        }
        int longest = 1;
        HashSet<Integer> s = new HashSet<>();

        for(int i = 0; i < n; i++){
            s.add(nums[i]);
        }

        for(int it : s){
            if(!s.contains(it - 1)){
                int count = 1;
                int x = it;
                while(s.contains(x + 1)){
                    x++;
                    count++;
                }
                longest = Math.max(longest, count);
            }
        }
        return longest;

    }
}
