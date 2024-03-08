class Solution {
     public static int[][] merge(int[][] intervals) {
        int n = intervals.length; // size of the array
        // sort the given intervals:
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        List<int[]> merged = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            // if the current interval does not
            // lie in the last interval:
            if (merged.isEmpty() || intervals[i][0] > merged.get(merged.size() - 1)[1]) {
                merged.add(intervals[i]);
            }
            // if the current interval
            // lies in the last interval:
            else {
                merged.get(merged.size() - 1)[1] = Math.max(merged.get(merged.size() - 1)[1], intervals[i][1]);
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }
}
