package gfg_160;
/*
Given an array arr[] containing only 0s, 1s, and 2s. Sort the array in ascending order.

You need to solve this problem without utilizing the built-in sort function.

Examples:

Input: arr[] = [0, 1, 2, 0, 1, 2]
Output: [0, 0, 1, 1, 2, 2]
Explanation: 0s 1s and 2s are segregated into ascending order.

Input: arr[] = [0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1]
Output: [0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2]
Explanation: 0s 1s and 2s are segregated into ascending order.

Follow up: Could you come up with a one-pass algorithm using only constant extra space?
Constraints:
1 <= arr.size() <= 106
0 <= arr[i] <= 2
 */
public class Day21_Sort012 {
    public static void main(String[] args) {

        int[] arr = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        sort012(arr);
        for(int num: arr){
            System.out.print(num+ " ");
        }
    }
    public static void sort012(int[] arr) {
        // code here
        int low=0, mid=0, high=arr.length-1;

        while(mid<=high){
            switch(arr[mid]){
                case 0:
                    int temp0 = arr[low];
                    arr[low]=arr[mid];
                    arr[mid]=temp0;
                    low++;
                    mid++;
                    break;

                case 1:
                    mid++;
                    break;

                case 2:
                    int temp2 = arr[high];
                    arr[high]=arr[mid];
                    arr[mid]=temp2;
                    high--;
                    break;
            }
        }
    }
}
