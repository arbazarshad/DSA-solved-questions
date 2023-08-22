/*you are given a number 'n'. find the numeber of digits n that evenly divide 'n'

Sample Input 1:
35

Sample Output 1:
1

Explanation Of Sample Output 1:
35 is only divisible by ‘5’, hence answer is 1.


Sample Input 2:
373

Sample Output 2:
0

Explanation Of Sample Output 2:
There’s no digit in 373 that evenly divides it. Hence the output is 0.

Expected Time Complexity:
Try to solve this in O(log(n)) 

Constraints:
1 <= ‘n’ <= 10^9
Time Limit: 1 sec
*/

Code:
public class Solution {
    public static int countDigits(int n){
        // Write your code here
        int sum = 0;
        int a = n;
        while(n>0)
        {
            int num = n%10;
            if(num == 0)
            {
                n = n/10;
                continue;
            }
            sum = sum + (a%num == 0?1:0);
            n = n/10;
        }
        return sum;
    }
}
