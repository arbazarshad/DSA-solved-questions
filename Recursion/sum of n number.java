
/*

print the sum of all the natural numbers till n using recursion

*/
Code:
public static void main(String[] args) {
        System.out.println(sumFirstN(3));
    
    }
    public static long sumFirstN(long n) {
        // Write your code here.
        long sum = 0;
        sum = getsum(sum,n);
        return sum;
    }
    public static long getsum(long sum,long n)
    {
        if(n == 0)
        {
            return sum;
        }
        sum = sum + n;
        return getsum(sum, n-1);
    }
