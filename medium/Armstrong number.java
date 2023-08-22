ARMSTRONG

/*
Check whether the given number is armstrong or not
Sample Input 1 :
1


Sample Output 1 :
true


Explanation Of Sample Input 1 :
1 is an Armstrong number as, 1^1 = 1.


Sample Input 2 :
103


Sample Output 2 :
false


Expected Time Complexity:
Try to solve this in O(log(n)). 


Constraints:
1 <= ‘n’ <= 10^9

Time Limit: 1 sec
*/

Code:
//import jdk.nashorn.internal.parser.Scanner;
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
	 	Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(check(n));
		
	}
	public static boolean check(int n)
	{
		int len = (int)Math.log10(n)+1;
		int a = n;
		int res = 0;
		for(int i = 0;i<len;i++)
		{
			res = res + (int)Math.pow((n%10), len);
			n = n/10;
		}
		if(res == a)
		{
			return true;
		}
		else{
			return false;
		}
	}
}
