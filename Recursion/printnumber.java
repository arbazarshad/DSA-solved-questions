/*
print the numbers from 1 to n without using loop

Sample Input 2:
2
Sample Output 2:
1 2
Explanation Of Sample Input 2:
Input: ‘n’ = 2

Output: 1 2

Explanation: An array containing integers from ‘1’ to ‘2’ is [1, 2].
Expected Time Complexity:
The expected time complexity is O(n), where 'n' is the given integer.
Expected Space Complexity:
The expected space complexity is O(n), where 'n' is the given integer.
Constraints:
1 <= n <= 10^4

Time Limit: 1-sec

*/
Code:
public class Solution {

    public static int[] printNos(int x) {
        // Write Your Code Here
        int[] arr = new int[x];
        arr = print(arr,0,x);
        return arr;
    }
    public static int[] print(int[] arr,int i, int n)
    {
        if(i < n)
        {
            arr[i] = i+1;
            return print(arr,i+1,n);
        }
        return arr;
    }
} 
