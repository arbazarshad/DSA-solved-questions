SUM OF ALL DIVISORS
/*
You are given an integer 'n'. find the sum of all the divisors of n. check the samples for more details

Sample Input 1:
3


Sample Output 1:
8


Explanation Of Sample Output 1:
We need to find sumOfDivisors(1) + sumOfDivisors(2) +sumOfDivisors(3).
sumOfDivisors(1) = 1
sumOfDivisors(2) = 2 + 1 = 3
sumOfDivisors(3) = 3 + 1 = 4
Therefore, the answer is sumOfDivisors(1) + sumOfDivisors(2) + sumOfDivisors(3) = 1 + 3 + 4 = 8. 

Sample Input 2:
10


Sample Output 2:
87


Expected Time Complexity:
Try to solve this in O(sqrt(‘n’)).


Constraints:
1 <= ‘n’ <= 3*10^4

Time Limit: 1 sec

*/


Code:
public class Solution {
    public static int sumOfAllDivisors(int n){
        // Write your code here.
        int sum = 0;
        while(n>0)
        {
            sum = sum + n;
            for(int i = n/2;i>0;i--)
            {
                if(n%i == 0)
                {
                    sum = sum + i;
                }
            } 
            n--;
        }
        return sum;
    }
}
