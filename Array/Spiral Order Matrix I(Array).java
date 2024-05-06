public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] spiralOrder(final int[][] A) {
        if (A == null || A.length == 0 || A[0].length == 0) {
            return new int[0];
        }
        int n = A.length;
        int m = A[0].length;
        int[] ans = new int[n*m];
        int top = 0, left = 0, right = m - 1, bottom = n - 1, index = 0;
        
        while(top <= bottom && left <= right){
            
            for(int i = left; i <= right; i++){
                ans[index++] = A[top][i];
            }
            top++;
            
            for(int i = top; i <= bottom; i++){
                ans[index++] = A[i][right];
            }
            right--;
            
            if(top <= bottom){
                for(int i = right; i >= left; i--){
                    ans[index++] = A[bottom][i];
                }
                bottom--;
            }
            if(left <= right){
                for(int i = bottom; i >= top; i--){
                    ans[index++] = A[i][left];
                }
                left++;
            }
        }
        return ans;
    }
}
