BUBBLE SORT
/*
Given an array 
we need to sort the array using bubble sort

steps 1: we first take the highest value in the array to the last postion in the array by swaping the elements in the array it the number gets to last
step 2: we then reduce the end with -1 so that we compute the remain array till the last-1 term which means we ignored the last term
step 3: we keep on doing the step 1 and 2 again and again till we get the desired result 

*/

Code:
public static void main(String[] args) {
        int[] arr = {13,46,24,52,20,9};
        System.out.println(Arrays.toString(bubblesort(arr,0,arr.length-1)));
    }

    private static int[] bubblesort(int[] arr,int start,int end) {
        if(end == start)
        {
            return arr;
        }
        
        while(start<end)
        {
            if(arr[start]>arr[start+1])
            {
                int temp = arr[start];
                arr[start] = arr[start+1];
                arr[start+1] = temp;
            }
            start++;
        }
        return bubblesort(arr, 0, end-1);
    }
        
