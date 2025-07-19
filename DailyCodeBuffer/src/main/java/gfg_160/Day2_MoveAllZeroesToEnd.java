package gfg_160;

import java.util.Arrays;

/* You are given an array arr[] of non-negative integers.
Your task is to move all the zeros in the array to the right end while maintaining the relative order of the non-zero elements.
The operation must be performed in place, meaning you should not use extra space for another array.

// Examples:
Input: arr[] = [1, 2, 0, 4, 3, 0, 5, 0]
Output: [1, 2, 4, 3, 5, 0, 0, 0]
Explanation: There are three 0s that are moved to the end.

Input: arr[] = [10, 20, 30]
Output: [10, 20, 30]
Explanation: No change in array as there are no 0s.

Input: arr[] = [0, 0]
Output: [0, 0]
Explanation: No change in array as there are all 0s.

*/
public class Day2_MoveAllZeroesToEnd {
    static void pushZerosToEnd(int[] arr) {
        int n = arr.length;
        int index =0;

        //Traverse the array and shift non-zero elements to the left
        for(int i=0; i<n; i++){
            if(arr[i]!=0){
                arr[index++] = arr[i]; //Moving non-zero elements forward
            }
        }

        //Fill the remaining positions with zero
        while(index<n){
            arr[index++]=0; //place zero in the remainin positions
        }
    }

    public static void main(String[] args){
        int[] arr = {1,2,0,4,3,0,5,0};
        pushZerosToEnd(arr);
        System.out.println(Arrays.toString(arr));
    }
}

/*
Environment TIP:

The platform expects non-static method inside a class named Solution.

The non-static method should have the return value for what you're required to return to solve the question.

You are not required to call this non-static method inside a main method. You don't need to create the main method, the code will work fine without it

The above code will work on your IDE but not on GFG environment. The code that will work on the GFG eenvironment:

import java.util.Arrays;

class Solution {
    public int[] moveZerosToEnd(int[] arr) {
        int n = arr.length;
        int index = 0; // Tracks where non-zero elements should be placed

        // Step 1: Move non-zero elements forward
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[index++] = arr[i]; // Shift non-zero numbers forward
            }
        }

        // Step 2: Fill remaining positions with zeros
        while (index < n) {
            arr[index++] = 0;
        }

        return arr; // Return the modified array
    }
}

 */



