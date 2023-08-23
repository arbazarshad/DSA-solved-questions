/*
Expected Time Complexity:
Try to solve this in O(n).


Expected Space Complexity:
Try to solve this in O(n).


Constraints:
1 <= 'n' <= 10^4

Time Limit: 1 sec

*/

Code:
import java.util.List;
public class Solution {
    public static void printNtimes(int n){
        // Write your code here.
        if(n > 0)
        {
            System.out.print("Follow my profiles for more..."+ " ");
            printNtimes(n-1);
        }
    }
}
