class Solution {
    public int[][] merge(int[][] intervals) {
        // Get the length of the intervals array
        int n = intervals.length;

        // Sort the intervals array based on the first element of each sub-array
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        // Create a list to hold the merged intervals
        List<int[]> merged = new ArrayList<>();

        // Iterate through each interval
        for(int i = 0; i < n; i++){
            // If merged list is empty or current interval does not overlap with the last one in the merged list,
            // add it to the list
            if(merged.isEmpty() || intervals[i][0] > merged.get(merged.size() - 1)[1]){
                merged.add(intervals[i]);
            }
            // If there is an overlap, merge the current interval with the last one in the merged list
            else{
                merged.get(merged.size() - 1)[1] = Math.max(merged.get(merged.size() - 1)[1], intervals[i][1]);
            }
        }
        // Convert the list of merged intervals back to a 2D array and return it
        return merged.toArray(new int[merged.size()][]);
    }
}
