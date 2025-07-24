package gfg_160;
/*
Given a sorted array of distinct positive integers arr[], we need to find the kth positive number that is missing from arr[].

Examples :

Input: arr[] = [2, 3, 4, 7, 11], k = 5
Output: 9
Explanation: Missing are 1, 5, 6, 8, 9, 10… and 5th missing number is 9.

Input: arr[] = [1, 2, 3], k = 2
Output: 5
Explanation: Missing are 4, 5, 6… and 2nd missing number is 5.

Input: arr[] = [3, 5, 9, 10, 11, 12], k = 2
Output: 2
Explanation: Missing are 1, 2, 4, 6… and 2nd missing number is 2.

Constraints:
1 <= arr.size() <= 105
1 <= k <= 105
1 <= arr[i]<= 106
 */
public class Day35_KthMissingPositiveNo {
    public static void main(String[] args) {

        int[] arr ={3, 5, 9, 10, 11, 12};
        int k=2;
        int result = kthMissing(arr, k);
        System.out.println(result);
    }
    public static int kthMissing(int[] arr, int k) {
        // code here
        int lo=0, hi=arr.length;
        while(lo<hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]-(mid+1)<k){
                lo=mid+1;
            } else {
                hi=mid;
            }
        }
        return lo+k;
    }
}
