public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int lowerBound(List<Integer> A, int B){
        int n = A.size();
        int low = 0, high = n - 1;
        int ans = n;
        
        while(low <= high){
            int mid = (low + high)/2;
            if(A.get(mid) >= B){
                ans = mid;
                high = mid - 1;
            }else
                low = mid + 1;
        }
        return ans;
    }
    
    public int upperBound(List<Integer> A, int B){
        int n = A.size();
        int low = 0, high = n - 1;
        int ans = n;
        
        while(low <= high){
            int mid = (low + high)/2;
            if(A.get(mid) > B){
                ans = mid;
                high = mid - 1;
            }else
                low = mid + 1;
        }
        return ans;
    }
    
    public ArrayList<Integer> searchRange(final List<Integer> A, int B) {
        
        int a = lowerBound(A, B);
        int b = upperBound(A, B) - 1;
        ArrayList<Integer> res = new ArrayList<>();
        if(a == A.size() || A.get(a) != B){
            res.add(-1);
            res.add(-1);
        }else{
            res.add(a);
            res.add(b);
        }
        return res;
        
    }
}
