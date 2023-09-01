/*
Given a string s, find the length of the longest 
substring
 without repeating characters.

 

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

we take a left and right and then we take a hashmap wich contatins char and their postion/index
now we start from first index till r is less than the length of string
now we extract the char and check if exist in hashmap if it doesnt we increment the len and r 
if it exist then we check for the postion of the char where it occured using hashmap and then update the l to repeated index+1

explanation : https://takeuforward.org/strivers-a2z-dsa-course/strivers-a2z-dsa-course-sheet-2/


*/

Code:
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        int r = 0;
        int len  = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        while(r<s.length())
        {
            if(map.containsKey(s.charAt(r)))
            {
                l = Math.max(map.get(s.charAt(r))+1,l);
            }
            map.put(s.charAt(r), r);
            len = Math.max(len,r-l+1);
            r++;
        }
        return len;
    }
}
