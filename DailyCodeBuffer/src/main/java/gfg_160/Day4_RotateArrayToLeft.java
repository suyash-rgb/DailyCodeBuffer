package gfg_160;
/*
Given an array arr[]. Rotate the array to the left (counter-clockwise direction) by d steps, where d is a positive integer. Do the mentioned change in the array in place.

Note: Consider the array as circular.

Examples :

Input: arr[] = [1, 2, 3, 4, 5], d = 2
Output: [3, 4, 5, 1, 2]
Explanation: when rotated by 2 elements, it becomes 3 4 5 1 2.

*/

import java.util.Arrays;
public class Day4_RotateArrayToLeft {
    static int[] rotateArr(int arr[], int d) {

        int n =  arr.length;

        for(int i=0; i<d; i++){
            int first = arr[0];  //first element
            for(int j=0; j<n-1;j++){
                arr[j]=arr[j+1];
            }
            arr[n-1]=first;
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5}, d=2;

        System.out.println(Arrays.toString(rotateArr(arr, d)));
    }
}
