REVERSE INTEGER

/*Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

 

Example 1:

Input: x = 123
Output: 321
Example 2:

Input: x = -123
Output: -321
Example 3:

Input: x = 120
Output: 21
 

Constraints:

-231 <= x <= 231 - 1

*/

code:
class Solution {
    public int reverse(int x) {
        long ans = 0;
    int a = x;
    if(x < 0)
    {
        x = -1 * x;
    }
    int digit = 0;
    long m = 0;
    int q;
    while(x>0)
    {
        digit = x%10;
        m = (long)Math.pow(10,(int)Math.log10(x)) * digit;
        q = (int)(digit * Math.pow(10,(int)Math.log10(x)));
        if(q == m)
        {   
            
            ans = ans + m;
            
                x = x/10;
            
        }
        else
        {
            ans = 0;
            break;                
        }
            
    }

    if(a<0)
        ans = -1 * ans;
    int y = (int)ans;
    if( y == ans)
        if(ans > (-1 * Math.pow(2,31)) && ans < (Math.pow(2,31)-1) )
            return y;
        else 
            return 0;
    else   
        return 0;
}
}
