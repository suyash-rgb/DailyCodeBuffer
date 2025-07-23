package gfg_160;
/*
Given a sorted array, arr[] and a number target, you need to find the number of occurrences of target in arr[].

Examples :

Input: arr[] = [1, 1, 2, 2, 2, 2, 3], target = 2
Output: 4
Explanation: target = 2 occurs 4 times in the given array so the output is 4.

Input: arr[] = [1, 1, 2, 2, 2, 2, 3], target = 4
Output: 0
Explanation: target = 4 is not present in the given array so the output is 0.

Input: arr[] = [8, 9, 10, 12, 12, 12], target = 12
Output: 3
Explanation: target = 12 occurs 3 times in the given array so the output is 3.

Constraints:
1 ≤ arr.size() ≤ 106
1 ≤ arr[i] ≤ 106
1 ≤ target ≤ 106
 */
public class Day28_NumberOfOccurance {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 2, 3};
        int target =2;
        int result = countFreq(arr, target);

    }
    public static int countFreq(int[] arr, int target) {
        // code here
        int low=0, high=arr.length-1;
        while(low<high){
            int mid=low+(high-low)/2;
            if(arr[mid]<target)
                low=mid+1;
            else
                high=mid;
        }

        if(low>=arr.length||arr[low]!=target)
            return 0;

        int first = low;
        high = arr.length-1;
        while(low<high){
            int mid=low+(high-low+1)/2;
            if(arr[mid]>target)
                high=mid-1;
            else
                low=mid;
        }

        int last=high;
        return last-first+1;
    }
}
