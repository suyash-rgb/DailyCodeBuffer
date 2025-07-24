package gfg_160;
/*
Given a strictly sorted 2D matrix mat[][] of size n x m and a number x. Find whether the number x is present in the matrix or not.
Note: In a strictly sorted matrix, each row is sorted in strictly increasing order, and the first element of the ith row (i!=0) is greater than the last element of the (i-1)th row.

Examples:

Input: mat[][] = [[1, 5, 9], [14, 20, 21], [30, 34, 43]], x = 14
Output: true
Explanation: 14 is present in the matrix, so output is true.

Input: mat[][] = [[1, 5, 9, 11], [14, 20, 21, 26], [30, 34, 43, 50]], x = 42
Output: false
Explanation: 42 is not present in the matrix.

Input: mat[][] = [[87, 96, 99], [101, 103, 111]], x = 101
Output: true
Explanation: 101 is present in the matrix.
 */
public class Day40_SearchInASortedMatrix {
    public static void main(String[] args) {

    }
    public boolean searchMatrix(int[][] mat, int x) {
        // code here
        int n=mat.length, m=mat[0].length, l=0, r=n*m-1;
        while(l<=r){
            int mid=(l+r)/2, val=mat[mid/m][mid%m];
            if(val==x)
                return true;
            if(val<x)
                l=mid+1;
            else
                r=mid-1;
        }
        return false;
    }
}
