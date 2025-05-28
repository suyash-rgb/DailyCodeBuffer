package gfg_160;

/*
Given an array of integers arr[] representing a permutation, implement the next permutation that rearranges the numbers into the lexicographically next greater permutation. If no such permutation exists, rearrange the numbers into the lowest possible order (i.e., sorted in ascending order).

Note - A permutation of an array of integers refers to a specific arrangement of its elements in a sequence or linear order.

Examples:

Input: arr = [2, 4, 1, 7, 5, 0]
Output: [2, 4, 5, 0, 1, 7]
Explanation: The next permutation of the given array is {2, 4, 5, 0, 1, 7}.

Input: arr = [3, 2, 1]
Output: [1, 2, 3]
Explanation: As arr[] is the last permutation, the next permutation is the lowest one.

*/

import java.util.Arrays;

public class Day5_NextPermutation {
    public int[] nextPermutation(int[] arr) {
        int n = arr.length;
        int i = n-2;

        //
        while(i>=0&&arr[i]>=arr[i+1]){
            i--;
        }

        //swap with next larger element
        if(i>=0){
            int j=n-1;
            while(arr[j]<=arr[i]){
                j--;
            }
            swap(arr,i,j);
        }

        //Reverse the remaining elements
        reverse(arr, i+1, n-1);
        return arr;
    }

    private void swap(int[] arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    private void reverse(int[] arr, int start, int end){
        while(start<end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,4,1,7,5,0};
        Day5_NextPermutation obj = new Day5_NextPermutation();
        System.out.println(Arrays.toString(obj.nextPermutation(arr)));
    }
}
