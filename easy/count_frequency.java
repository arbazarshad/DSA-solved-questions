Count the frequency of the given numbers in the array
/*
you are given an array 'arr' of length 'n' containing integer within the range 1 to x
find and print the frequency of each number in the given array
Sample Input 1:
6 4
1 3 4 3 4 1
Sample Output 1:
2 0 2 2 0 0
Explanation Of Sample Input 1 :
Frequency table:
Number         Count 
 1                2
 2                0
 3                2
 4                2
 5                0
 6                0
Sample Input 2 :
5 5
1 2 3 4 5
Sample Output 2 :
1 1 1 1 1
Explanation Of Sample Input 2 :
Frequency table:
Number         Count 
 1                1
 2                1
 3                1
 4                1
 5                1
Constraints:
1  <= n <= 10^5
1  <= x <= 10^5
1 <= arr[i] <= x
  */

SOLUTION FOR THE CODING NINJAS
Code:
import java.util.Arrays;

public class Solution {
    public static int[] countFrequency(int n, int x, int []nums){
        // Write your code here.
        int[] arr = new int[n];
        Arrays.fill(arr, 0);
        for(int i = 0;i<n;i++)
        {
            if(nums[i]<n+1)
                arr[nums[i]-1] = arr[nums[i]-1] + 1;
            else    
                continue;
        }
        return arr;
    }
}


CORRECT SOLUTION FOR THE GIVEN PROBLEM:
Code:
public static void main(String[] args) {
        int[] arr1 = {11,14,8,3,12,14,1,7,4,3};
        int n = 10;
        int x = 14;
       int[] arr = new int[x];
        Arrays.fill(arr, 0);
        for(int i = 0;i<n;i++)
        {
            arr[arr1[i]-1] = arr[arr1[i]-1] + 1;
        }
        System.out.println(Arrays.toString(arr));
    }
