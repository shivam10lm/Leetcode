import java.util.* ;
import java.io.*; 

public class Solution {

	public static int sqrtN(long N) {
		/*
		 * Write your code here
		 */
		 long low = 1, high = (int)N;
		 long ans = 1;

		 while(low <= high){
			 long mid = (low + high)/2;

			 if(mid * mid <= N){
			 	ans = mid;
				 low = mid + 1;
				
			 }
			else
				high = mid - 1;
		 }
		 return (int)high;
	}
}
