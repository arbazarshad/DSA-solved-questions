Kadane’s Algorithm : Maximum Subarray Sum in an Array
 /* Approach:
The steps are as follows:

We will run a loop(say i) to iterate the given array.
Now, while iterating we will add the elements to the sum variable and consider the maximum one.
If at any point the sum becomes negative we will set the sum to 0 as we are not going to consider it as a part of our answer.
Note: In some cases, the question might say to consider the sum of the empty subarray while solving this problem. So, in these cases, before returning the answer we will compare the maximum subarray sum calculated with 0(i.e. The sum of an empty subarray is 0). And after that, we will return the maximum one.
For e.g. if the given array is {-1, -4, -5}, the answer will be 0 instead of -1 in this case. 

This is applicable to all the approaches discussed above.

But if this case is not explicitly mentioned we will not consider this case.

  */

  Code:
class Solution {
    public int maxSubArray(int[] arr) {
        int maxi = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0;i<arr.length;i++)
        {
            sum = sum + arr[i];
            if(sum>maxi)
            {
                maxi = sum;
            }
            if(sum<0)
            {
                sum = 0;
            }
        }
        return maxi;
    }
}
