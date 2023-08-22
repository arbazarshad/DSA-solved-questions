/*
Reverse the given numbers bits and convert into unsigned integer
Sample Input 1 :
2
0
12
Sample Output 1:
 0
 805306368
Explanation For Sample Input 1 :
For the first test case :
Since the given number N = 0 is represented as 00000000000000000000000000000000 in its binary representation. So after reversing the bits, it will become 00000000000000000000000000000000 which is equal to 0 only. So the output is 0.     



For the second test case :
Since the given number N = 12 is represented as 00000000000000000000000000001100 in its binary representation. So after reversing the bits, it will become 0110000000000000000000000000000, which is equal to 805306368 only. So the output is 805306368.
Sample Input 2 :
2
6
4
Sample Output 2 :
 1610612736
 536870912
Explanation For Sample Input 1 :
For the first test case :
Since the given number N = 6 is represented as 00000000000000000000000000000110 in its binary representation. So after reversing the bits, it will become 01100000000000000000000000000000, which is equal to 1610612736.


For the second test case :
Since the given number N = 4 is represented as 00000000000000000000000000000100 in its binary representation. So after reversing the bits, it will become 0010000000000000000000000000000, which is equal to 536870912 only.
Expected Time Complexity:
The expected time complexity is O(log(n)).
Constraints :
1 <= T <= 10
0 <= N <= 2^32

Time Limit: 1 sec

  */
/*
we create an ans variable then
  n = 0 0 0 0 0 0 0 0
ans = 0 0 0 0 0 0 0 0
ans = ans | (n&1)
n&1 return the bit in the 1 position then that returned value in inserted to ans and then the ans is left shifted
  after left shift of ans the n is right shifted so that the next bit can be selected in the next iteration 
  n << 1 = n leftshift 1 time
  */
Code:
public class Solution {
	public static long reverseBits(long n) {
		// Write your code here
		long ans = 0;
		for(int i = 0;i<32;i++)
		{
			ans = ans<<1;
			ans = ans | (n&1);
			n = n>>1;
		}
		return ans;
	}
}
