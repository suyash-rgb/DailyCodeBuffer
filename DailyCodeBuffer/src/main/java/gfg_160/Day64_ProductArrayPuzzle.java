package gfg_160;
/*
Given an array arr of 0s and 1s. Find and return the length of the longest subarray with equal number of 0s and 1s.

Examples:

Input: arr[] = [1, 0, 1, 1, 1, 0, 0]
Output: 6
Explanation: arr[1...6] is the longest subarray with three 0s and three 1s.

Input: arr[] = [0, 0, 1, 1, 0]
Output: 4
Explnation: arr[0...3] or arr[1...4] is the longest subarray with two 0s and two 1s.

Input: arr[] = [0]
Output: 0
Explnation: There is no subarray with an equal number of 0s and 1s.

Constraints:
1 <= arr.size() <= 105
0 <= arr[i] <= 1
 */
public class Day64_ProductArrayPuzzle {
    public static void main(String[] args) {

    }
    public static int[] productExceptSelf(int[] arr) {
        int n = arr.length, product = 1, zeroCount = 0;
        for (int x : arr) if (x == 0) zeroCount++; else product *= x;
        if (zeroCount > 1) return new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = zeroCount > 0 ? (arr[i] == 0 ? product : 0) : product / arr[i];
        return arr;
    }
}
