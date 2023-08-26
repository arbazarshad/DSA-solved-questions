HIGHEST AND LOWEST FREQUENTLY OCCURING NUMBER IN THE GIVEN ARRAY
/*
The below code will give the number which is occuring the most times and the number which occurs very less
ex: {1,2,4,1,3,5,7,11,99,8,1,7,6,99,98}
here the output will be 1 2
as 1 occur's 3 times and 2 occurs 1 time,  but here all the other numbers too occur 1 time but we need the number which is less than other numner and occurs the least times hence it will be 2
if there as an other number '95' which occurs 3 times the the output will be 95 as we need the number which occurs most frequently and the number must be greater


the given code exceeds the complexity 
so i have provided an other code which uses hashing to reduce the complexity of the code and make it more effective

Expected Time Complexity :
The expected time complexity is O(n), where n is the size of the array.
Expected Space Complexity :
The expected time complexity is O(n), where n is the size of the array.
Constraints :
2 <=  n <= 10^4
1 <= v[i] <= 10^9
There are at least two distinct elements in the array.
Time Limit: 1 sec 
*/

Code:
public static void main(String[] args) {
        int[] arr = {10,10,10,3,3,3};
        arr = getFrequencies(arr);
        System.out.println(Arrays.toString(arr));
    }
        public static int[] getFrequencies(int[] v) {
            // Write Your Code Here
            /*int[] arrmax = Arrays.sort(v);
            int m = arrmax[arrmax.length-1];*/
        int m = 0;
        int mi = 0;
        int j = 1;
        while(j<v.length-1)
        {
            if(v[m] < v[j])
            {
                m = j;
            }
            if(v[mi] > v[j])
            {
                mi = j;
            }
            j++;
        }
        int[] arr = new int[v[m]];
        Arrays.fill(arr, 0);
        for(int i = 0;i<v.length;i++)
        {
            arr[v[i]-1] = arr[v[i]-1] + 1;
        }
        int max = 0;
        int min = v[mi]-1;
        int i = 1;
        while(i<arr.length)
        {
            if(arr[min]>arr[i] && arr[i] != 0)
            {
                min = i;
            }
            if(arr[max] <= arr[i])
            {
                max = i;
            }
            i++;
        }
        int[] res = {max+1,min+1};
        return res;
        }




USING HASHING (HASHMAP)
Code:
