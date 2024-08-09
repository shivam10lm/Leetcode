class Solution {
    public int missingNumber(int[] nums) {
        int XOR1 = 0, XOR2 = 0;
        int n = nums.length;

        for(int i = 0;i < n;i++){
            XOR1 = XOR1 ^ (i + 1);
            XOR2 = XOR2 ^ nums[i];
            
        }
        return (XOR1 ^ XOR2);
    }
}
