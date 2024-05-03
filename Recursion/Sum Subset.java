class Solution {
    
    void func(int ind, int sum, ArrayList<Integer> arr, int n, ArrayList<Integer> sumSubset){
        if(ind == n){
            sumSubset.add(sum);
            return;
        }
        
        func(ind + 1, sum + arr.get(ind), arr, n, sumSubset);
        func(ind + 1, sum, arr, n, sumSubset);
    } 
    
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int n) {
        // code here
        ArrayList<Integer> sumSubset = new ArrayList<>();
        func(0, 0, arr, n, sumSubset);
        return sumSubset;
        
    }
}
