/*
you are given two numbers n and m ,  calculate the gcd of the two numbers
Sample Input 1:
9 6


Sample Output 1:
3


Explanation Of Sample Output 1:
gcd(6,9) is 3, as 3 is the largest positive integer that divides both 6 and 9.

Sample Input 2:
2 5


Sample Output 2:
1


Expected Time Complexity:
Try to solve this in O(log(n)) 


Constraints:
0 <= ‘n’ <= 10^5

Time Limit: 1 sec
*/

Code:
public class Solution {
    public static int calcGCD(int n, int m){
        // Write your code here.
        int temp = n;
        n = n<m?n:m;
        m = temp<m?m:temp;
        int r = 1;
        while(n!=0)
        {
            r = m % n;
            m = n;
            n = r;
        }
        return m;
    }
}
