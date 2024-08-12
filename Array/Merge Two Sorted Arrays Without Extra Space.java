class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int left = m - 1; // Start from the end of the initialized part of nums1
        int right = 0; // Start from the beginning of nums2

        // Loop through nums1 and nums2 until we've compared all their elements
        while(left >= 0 && right < n){
            // If the current element in nums1 is greater than the current element in nums2
            if(nums1[left] > nums2[right]){
                // Swap the elements
                int temp = nums1[left];
                nums1[left] = nums2[right];
                nums2[right] = temp;
                // Move the pointers accordingly
                left--; // Move the nums1 pointer backwards
                right++; // Move the nums2 pointer forwards
            }
            else{
                // If the current element in nums1 is not greater, no need to continue swapping
                break;
            }
        }
        // Sort nums1 and nums2 to ensure they are in ascending order after swaps
        Arrays.sort(nums1, 0, m);
        
        // Sort nums2 from start to end
        Arrays.sort(nums2);
        
        // Put the elements of nums2 in nums1
        for (int i = m; i < m + n; i++) {
            nums1[i] = nums2[i - m];
        }
    }
}
