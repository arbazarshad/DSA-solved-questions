PALINDROME NUMBER
/*
check whether the given number is equal to the number when reversed
Sample Input 1 :
1032
Sample Output 1 :
false
Explanation Of Sample Input 1:
1032, on being reversed, gives 2301, which is a totally different number.
Sample Input 2 :
121
Sample Output 2 :
true
Explanation Of Sample Input 2:
121, on being reversed, gives 121, which is the same.
Expected Time Complexity:
The expected time complexity is O(log(n)).
Constraints :
1 <= n <= 10^9
Time Limit: 1 sec
*/

Code:
public class Solution {
    public static boolean palindromeNumber(int n){
        // Write your code here.
        int p = 0;
        int a = n;
        int digit = 0;
        while(n>0)
        {
            digit = n%10;
            p = p*10;
            p = p + digit;
            
            n = n/10;
        }
        if(p == a)
        {
            return true;
        }
        else{
            return false;
        }
    }
}



Code:
class Solution {
    public boolean isPalindrome(int x) {
        // 0 is palindrome.
        if (x == 0) { return true; }

        // Negative values and the numbers that are
        // multiples of 10 are not palindromes.
        if (x < 0 || x % 10 == 0) { return false; }

        // Reverse the integer until its half.
        int reversed = 0;
        while (x > reversed) {
            int popped = x % 10;
            x /= 10;
            reversed = (reversed * 10) + popped;
        }

        // We are also checking if x is equal to reversed / 10
        // cuz the length of the integer may be an odd number.
        return x == reversed || x == reversed / 10;
    }
}
