Recursive Insertion sort
/*
you are given an array of length n 
sorting the array using insertion sort technique

step 1 : we check for the 2 consecutive number 
step 2 : if the number need to be sorted we then sort the consecutive numbers
step 3 : then we check for the upcoming consecutive numbers where we sort if needed until they second number gets sorted 
step 4 : follow the step 3 util the last consecutive number

example:

[9, 3, 6, 2, 0] check 9 and 3
[3, 9, 6, 2, 0] check for 9 and 6
[3, 6, 9, 2, 0] 6 and 9 are sorted
[3, 6, 9, 2, 0]
[3, 6, 9, 2, 0] check for 9 and 2
[3, 6, 2, 9, 0] 9 and 2 are sorted
[3, 2, 6, 9, 0] check for 6 and 2 and they are sorted
[2, 3, 6, 9, 0] checked for 3 and 2 and they are sorted
[2, 3, 6, 9, 0] check again from 2
[2, 3, 6, 9, 0] pointer incremented
[2, 3, 6, 9, 0] again
[2, 3, 6, 9, 0] again
[2, 3, 6, 0, 9] check for 9 and 0 and sort them
[2, 3, 0, 6, 9] again check
[2, 0, 3, 6, 9] again check
[0, 2, 3, 6, 9] again check


*/

Code:
public static void main(String[] args) {
        int[] arr = {9,3,6,2,0};
        System.out.println(Arrays.toString(insertionsort(arr,1,arr.length)));
    }

    private static int[] insertionsort(int[] arr,int pointer, int n) {
        
        if(pointer == n)
        {
            return arr;
        }
        if(pointer != 0 && arr[pointer] < arr[pointer-1] )
        {
            int temp = arr[pointer];
            arr[pointer] = arr[pointer-1];
            arr[pointer-1] = temp;
            return insertionsort(arr, pointer-1, n);
        }
        return insertionsort(arr, pointer+1, n);
    }

Mwthod 2: using a loop inside the recursive function
Code:
public class Solution {

 public static void print(int[] arr,int i){

        if(i>=arr.length){

            return;

        }

        int j=i;

        while(j>0 && arr[j-1]>arr[j]){

            int temp=arr[j-1];

            arr[j-1]=arr[j];

            arr[j]=temp;

            j--;

        }

        print(arr,i+1);

    }

    public static void insertionSort(int[] arr, int size) {

        //Your code goes here

        print(arr,0);

    }

}
