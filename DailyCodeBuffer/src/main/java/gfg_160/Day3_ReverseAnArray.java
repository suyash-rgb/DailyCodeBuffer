package gfg_160;

/*

You are given an array of integers arr[]. Your task is to reverse the given array.

Note: Modify the array in place.

Examples:

Input: arr = [1, 4, 3, 2, 6, 5]
Output: [5, 6, 2, 3, 4, 1]
Explanation: The elements of the array are 1 4 3 2 6 5.
After reversing the array, the first element goes to the last position, the second element goes to the second last position and so on.
Hence, the answer is 5 6 2 3 4 1.

 */

import java.util.Arrays;

public class Day3_ReverseAnArray {

    public static int[] reverseArray(int[] arr){
        int left = 0, right=arr.length-1;

        //swap elements from both the ends towards the center
        while(left<right){
            int temp = arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(reverseArray(arr)));
    }
}
