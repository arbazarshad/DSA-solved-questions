/*
Given an array 'arr' of size 'n' return all the elements placed in reverse order

Sample Input 1:
8
3 1 1 7 4 2 6 11
Sample Output 1:
11 6 2 4 7 1 1 3    
Explanation Of Sample Input 1 :
After reversing the array, it looks like this [11, 6, 2, 4, 7, 1, 1, 3].
Sample Input 2:
4
8 1 3 2
Sample Output 2:
2 3 1 8
Explanation Of Sample Input 2 :
After reversing the array, it looks like this [2, 3, 1, 8].
Expected Time Complexity
Expected time complexity if O(n)
Constraints:
1 <= n <= 10^6
-10^9<= arr[i] <=10^9
  */
Code;
public class Solution {
    public static int[] reverseArray(int n, int []nums) {
        // Write your code here.
        int[] arr = new int[nums.length];
        arr = reverse(0,n-1,nums);
        return arr;
    }
    public static int[] reverse(int s,int e,int[] arr)
    {
        if(s<e)
        {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            reverse(s+1,e-1,arr);
        }
        return arr;
    }
}
