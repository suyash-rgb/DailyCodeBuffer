package gfg_160;
/*
Given an array of integers arr[], the task is to find the first equilibrium point in the array.

The equilibrium point in an array is an index (0-based indexing) such that the sum of all elements before that index is the same as the sum of elements after it. Return -1 if no such point exists.

Examples:

Input: arr[] = [1, 2, 0, 3]
Output: 2
Explanation: The sum of left of index 2 is 1 + 2 = 3 and sum on right of index 2 is 3.

Input: arr[] = [1, 1, 1, 1]
Output: -1
Explanation: There is no equilibrium index in the array.

Input: arr[] = [-7, 1, 5, 2, -4, 3, 0]
Output: 3
Explanation: The sum of left of index 3 is -7 + 1 + 5 = -1 and sum on right of index 3 is -4 + 3 + 0 = -1.

Constraints:
3 <= arr.size() <= 105
-104 <= arr[i] <= 104
 */
public class Day61_EquilibriumPoint {
    public static void main(String[] args) {

    }
    public static int findEquilibrium(int arr[]) {
        // code here
        long sum=0, sum2=0;
        for(int val: arr){
            sum+=val;
        }
        for(int i=0; i<arr.length; sum2+=arr[i++])
            if((sum-=arr[i])==sum2)
                return i;
        return -1;
    }
}
