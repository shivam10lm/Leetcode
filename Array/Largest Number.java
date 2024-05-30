public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public String largestNumber(final int[] A) {
        int n = A.length;
        String[] s = new String[n];
        
        for(int i = 0; i < n; i++){
            s[i] = String.valueOf(A[i]);
        }
        
        Arrays.sort(s, (a, b) -> (b+a).compareTo(a+b));
        
        return s[0].equals("0") ? "0" : String.join("",s);
    }
}
