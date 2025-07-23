package gfg_160;
/*
Given an array of integers arr[]. You have to find the Inversion Count of the array.
Note : Inversion count is the number of pairs of elements (i, j) such that i < j and arr[i] > arr[j].

Examples:

Input: arr[] = [2, 4, 1, 3, 5]
Output: 3
Explanation: The sequence 2, 4, 1, 3, 5 has three inversions (2, 1), (4, 1), (4, 3).

Input: arr[] = [2, 3, 4, 5, 6]
Output: 0
Explanation: As the sequence is already sorted so there is no inversion count.

Input: arr[] = [10, 10, 10]
Output: 0
Explanation: As all the elements of array are same, so there is no inversion count.

Constraints:
1 ≤ arr.size() ≤ 105
1 ≤ arr[i] ≤ 104
 */
public class Day23_CountInversions {
    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 3, 5};
        int result = inversionCount(arr);
        System.out.println(result);
    }

    public static int inversionCount(int arr[]) {
        // Code Here
        int[] temp = new int[arr.length];
        return mergeSortAndCount(arr, temp, 0, arr.length-1);
    }

    private static int mergeAndCount(int[] arr, int[] temp, int left, int mid, int right){
        int i=left, j=mid+1, k=left, inversions=0;

        while(i<=mid&&j<=right){
            if(arr[i]<=arr[j]){
                temp[k++]=arr[i++];
            } else {
                temp[k++]=arr[j++];
                inversions+=(mid-i+1);
            }
        }

        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=right){
            temp[k++]=arr[j++];
        }

        for(i=left; i<=right; i++){
            arr[i]=temp[i];
        }

        return inversions;
    }

    private static int mergeSortAndCount(int[] arr, int[] temp, int left, int right){
        int inversions=0;

        if(left<right){
            int mid = left+(right-left)/2;

            inversions += mergeSortAndCount(arr, temp, left, mid);
            inversions += mergeSortAndCount(arr, temp, mid+1, right);
            inversions += mergeAndCount(arr, temp, left, mid, right);
        }
        return inversions;
    }

}
