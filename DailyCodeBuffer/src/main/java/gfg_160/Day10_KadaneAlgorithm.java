package gfg_160;
/*
You are given an integer array arr[]. You need to find the maximum sum of a subarray (containing at least one element) in the array arr[].

Note : A subarray is a continuous part of an array.

Examples:

Input: arr[] = [2, 3, -8, 7, -1, 2, 3]
Output: 11
Explanation: The subarray [7, -1, 2, 3] has the largest sum 11.

Input: arr[] = [-2, -4]
Output: -2
Explanation: The subarray [-2] has the largest sum -2.

Input: arr[] = [5, 4, 1, 7, 8]
Output: 25
Explanation: The subarray [5, 4, 1, 7, 8] has the largest sum 25.

Constraints:
1 ≤ arr.size() ≤ 105
-104 ≤ arr[i] ≤ 104
 */
public class Day10_KadaneAlgorithm {

    public static void main(String[] args) {

        int[] arr = {2, 3, -8, 7, -1, 2, 3};
        long result = maxSubarraySum(arr);
        System.out.println(result);
    }

    public static long maxSubarraySum(int[] arr) {
        long maxh = 0, maxf = Long.MIN_VALUE;

        for (int num : arr) {
            maxh = Math.max(num, maxh + num);
            maxf = Math.max(maxf, maxh);
        }

        return maxf;
    }
}
