
/*
Check Palindrome (recursive)

Sample Input 1:
abbba
Sample Output 1:
true
Explanation Of Sample Input 1 :
“abbba” is a palindrome
Sample Input 2:
abcd
Sample Output 2:
false
Explanation Of Sample Input 2 :
“abcd” is not a palindrome.
Constraints:
0 <= |S| <= 10^6
where |S| represents the length of string S.
*/
Code:
public class Solution {
    public static boolean isPalindrome(String str) {
        // Write your code here.
        char[] ch = str.toCharArray();
        if(check(ch,0,ch.length-1))
            return true;
        return false;
    }
    public static boolean check(char[] arr,int s,int e)
    {
        if(s>e)
            return true;
        if(arr[s] == arr[e])
        {
            return check(arr,s+1,e-1);
        }

        return false;
    }
}



2nd method:
Code:
bool isPalindrome(string& str) {

    // Write your code here.

  

    // Base case: if the string has 0 or 1 characters, it's a palindrome

    if (str.length() <= 1) {

        return true;

    }

    

    // Check if the first and last characters are the same

    if (str[0] != str[str.length() - 1]) {

        return false;

    }

 

    // Recursively check the substring between the first and last characters

    str = str.substr(1, str.length() - 2);

    

    return isPalindrome(str);

}

 
