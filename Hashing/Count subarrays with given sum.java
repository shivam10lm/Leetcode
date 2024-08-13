class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer,Integer> prefixSumMap = new HashMap<>();
        int currentPrefixSum = 0, count = 0;

        prefixSumMap.put(0,1);
        for(int i = 0; i < n; i++){
            currentPrefixSum += nums[i];

            int sumToRemove = currentPrefixSum - k;

            count += prefixSumMap.getOrDefault(sumToRemove, 0);

            prefixSumMap.put(currentPrefixSum, prefixSumMap.getOrDefault(currentPrefixSum, 0) + 1);
        }

        return count;

    }
}
