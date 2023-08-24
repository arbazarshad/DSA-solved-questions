Print Fibonacci Series till 'n'
/*
given a number 'n' return the fibonacci number of n using a generator operation
Sample Input 1:
5
Sample Output 1:
0 1 1 2 3
Explanation Of Sample Input 1:
The first 5 Fibonacci numbers are 0, 1, 1, 2, and 3.
Sample Input 2:
3
Sample Output 2:
0 1 1
Explanation Of Sample Input 2:
The first 5 Fibonacci numbers are 0, 1, 1.
Expected Time Complexity
The expected time complexity is O(n).
Constraints:
1 <= n <= 45
Time Limit: 1 s

*/

Code:
public class Solution {
    public static int[] generateFibonacciNumbers(int n) {
        // Write your code here.
        int[] arr = new int[n];
        return fibo(arr,n-1);
    }
    public static int[] fibo(int[] arr,int n)
    {
        
        if(n>=0)
        {
            arr[arr.length-1-n]  = fibonum(arr.length-1-n);
            return fibo(arr, n-1);
        }
        
        return arr;
        
    }
    public static int fibonum(int n)
    {
        
        if(n<=1)
        {
            return n;
        }
        return fibonum(n-1) + fibonum(n-2);
    }
}


method 2:
Code:
public class Solution {

    public static int fib(int n ){

        

        if(n <= 1 ){

            return n ;

 

        }

      return   fib(n-1) + fib(n-2);

    }

   

    public static int [] recursive(int i , int n , int []  arr){

        if( i == n){

            return arr;

        }

        

        arr[i] =  fib(i);

       return recursive(i+1 , n , arr);

 

    }

    public static int[] generateFibonacciNumbers(int n) {

       int [] arr = new int[n];

       int  i =0 ;

 

       return recursive(i,n,arr);

    }

}
