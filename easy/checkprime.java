CHECK PRIME OR NOT
/*


Sample Input 1:
5


Sample Output 1:
YES


Explanation Of Sample Input 1 :
5 is only divisible by 1 and 5. 2, 3 and 4 do not divide 5.


Sample Input 2:
6


Sample Output 2:
NO


Explanation Of Sample Input 2 :
6 is divisible by 1, 2, 3, and 6. Therefore it is not a prime number.
Numbers having more than two factors are known as composite numbers.


Sample Input 3:
1


Sample Output 3:
NO


Explanation Of Sample Input 3 :
1 is divisible only by 1, having only one factor. Therefore it is not a prime number.
1 is neither a prime nor a composite number.


Expected Time Complexity :
The expected time complexity is O(sqrt('n')).


Constraints :
1 <= 'n' <= 10 ^ 9

Time limit: 1 second
 */



/*

The given code defines a method isPrime that takes an integer num as input and checks if it is a prime number or not. A prime number is a natural number greater than 1 that has no positive divisors other than 1 and itself.

 

Let's break down the code and understand its intuition and approach:

 

The method isPrime takes an integer num as its input parameter.
The code checks three base cases using if-statements: a. If num is less than or equal to 1, it means num is not a prime number, so the method returns "NO". b. If num is 2 or 3, it is a prime number, so the method returns "YES". c. If num is divisible by 2 or 3, it means num is not a prime number (other than the cases already handled), so the method returns "NO".
If none of the base cases are triggered, the code proceeds to a for-loop that starts at i = 5 and runs until i is less than or equal to the square root of num. The loop increments i by 6 in each iteration (i += 6).
Inside the loop, the code checks if num is divisible by i or by i + 2. If num is divisible by either of these values, it means num is not a prime number, so the method returns "NO".
The loop continues for each value of i from 5 to the square root of num, incrementing by 6 in each iteration. This is because the prime numbers greater than 3 can be represented in the form of 6k ± 1, where k is an integer.
If none of the conditions inside the loop are satisfied, it means num is a prime number, and the method returns "YES".
 

The approach used in this code is to check for some common divisibility cases first to quickly identify non-prime numbers. Then, it uses a loop with a step of 6 to efficiently check for divisibility by numbers in the form of 6k ± 1, where k is an integer. This loop avoids checking divisibility by multiples of 2 and 3, which are already handled in the base cases.

 

The time complexity of the code is O(sqrt(n)), where n is the value of the input integer num. This is because the loop runs up to the square root of num to check for divisibility, and the loop has a step of 6, which reduces the number of iterations. Thus, the code efficiently determines if num is a prime number or not.


  */


Code;
public class Solution {
	public static String isPrime(int num) {
        if (num <= 1) {
            return "NO";
        }
        if (num == 2 || num == 3) {
            return "YES";
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return "NO";
        }
        for (int i = 5; i <= Math.sqrt(num); i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return "NO";
            }
        }
        return "YES";
    }
}
