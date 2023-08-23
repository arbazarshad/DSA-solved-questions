Factorial Numbers Not Greater Than N
/*
you are given a number 'n' 
your task is to return a sorted array containing all the factorial number which are less than or equal to the given number

Sample Input 1:
7
Sample Output 1 :
1 2 6
Explanation Of Sample Input 1:
Input: ‘n’ = 7

Output: 1 2 6

Explanation: Factorial numbers less than or equal to ‘7’ are ‘1’, ‘2’, and ‘6’.
Sample Input 2:
2
Sample Output 2:
1 2
Explanation Of Sample Input 2:
Input: ‘n’ = 2

Output: 1 2

Explanation: Factorial numbers less than or equal to ‘2’ are ‘1’ and ‘2’.
Expected Time Complexity:
The expected time complexity is O(m), where ‘m’ is the number of factorial numbers which are less than or equal to ‘n’.
Expected Space Complexity:
The expected space complexity is O(m), where ‘m’ is the number of factorial numbers which are less than or equal to ‘n’.
Constraints:
1 <= n <= 10^18

Time Limit: 1-sec



*/

Code:
import java.util.ArrayList;
import java.util.List;
public class Solution {
    public static List<Long> factorialNumbers(long n) {
        // Write Your Code Here
        ArrayList<Long> arr = new ArrayList<>();
        arr = fact(arr,n,1);
        return arr;
    }
    public static ArrayList<Long> fact(ArrayList<Long> arr,long n,long i)
    {
        long a = factorial(i);
        if(a <= n)
        {
            arr.add(a);
            fact(arr,n,i+1);
        }
        return arr;

    }
    public static long factorial(long n)
    {
        if(n == 0)
        {
            return 1;
        }
        return n * factorial(n-1);
    }
}
