/*

Sample Input 2:
2
Sample Output 2:
2 1
Explanation Of Sample Input 2:
Input: ‘n’ = 2

Output: 2 1

Explanation: An array containing integers from ‘2’ to ‘1’ is [2, 1].
Expected Time Complexity:
The expected time complexity is O(n), where 'n' is the given integer.
Expected Space Complexity:
The expected space complexity is O(n), where 'n' is the given integer.
Constraints:
1 <= n <= 10^4

Time Limit: 1-sec

*/

code:
public class Solution
{
    public static int[] printNos(int x) {
        // Write Your Code 
        int[] arr = new int[x];
        arr = print(arr,x);
        return arr;
    }
    public static int[] print(int[] arr,int n)
    {
        if(n>0)
        {
            arr[arr.length-n] = n;
            print(arr,n-1);
        }
        return arr;
    }
}
