/*
you are given an array.
using the selection sort try to sort the given array and print it

Using 2 methods i ahve solved the given problem
*/
Method I: 
Code:
public static void main(String[] args) {
        int[] arr = {8,6,2,5,1};
        //arr = getFrequencies(arr);
        //selectionSort(arr);
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void selectionSort(int[] arr) {
        //Your code goes here
        int start = 0;
        int end = arr.length-1;
        while(start < end)
        {
            arrsort(arr,start);
            start++;
        }
    }
    private static void arrsort(int[] arr, int start) {
        int minindex = findminindex(arr,start);
        if(start == minindex)
        {
            return;
        }
        else{
            int temp = arr[start];
            arr[start] = arr[minindex];
            arr[minindex] = temp;
        }
    }
    private static int findminindex(int[] arr,int start) {
        int index = start;

        for(int i = start;i<arr.length;i++)
        {
            if(arr[index] > arr[i])
            {
                index = i;
            }
        }
        return index;
    }


Method II: using Recursion
