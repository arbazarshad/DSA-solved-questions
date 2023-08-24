VALID PALINDROME
/*

A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.

 

Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.
 

Constraints:

1 <= s.length <= 2 * 105
s consists only of printable ASCII characters.
*/


Code:
class Solution {
    public boolean isPalindrome(String s) {
        
        s = s.toLowerCase();
        
        ArrayList<Character> c = new ArrayList<>();
        for(int i = 0;i<s.length();i++)
        {
            if(Character.isAlphabetic(s.charAt(i)) || s.charAt(i) >= '0' && s.charAt(i) <='9')
            {
                c.add(s.charAt(i));
            }
        }
        
        return palindrome(c,0,c.size()-1);
    }
       public static boolean palindrome(ArrayList<Character> a,int s,int e)
    {
        if(s>e)
        {
            return true;
        }
        char x = a.get(s);
        char y = a.get(e);
        
        if(x == y)
        {
            return palindrome(a, s+1, e-1);
        }
        return false;

    }

    
}
