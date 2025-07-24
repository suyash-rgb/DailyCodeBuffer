package gfg_160;
/*
Given a square matrix mat[][] of size n x n. The task is to rotate it by 90 degrees in an anti-clockwise direction without using any extra space.

Examples:

Input: mat[][] = [[0, 1, 2],
                [3, 4, 5],
                [6, 7, 8]]
Output: [[2, 5, 8],
        [1, 4, 7],
        [0, 3, 6]]
Input: mat[][] = [[1, 2],
                [3, 4]]
Output: [[2, 4],
        [1, 3]]
Constraints:
1 ≤ n ≤ 102
0 ≤ mat[i][j] ≤ 103
 */
public class Day37_RotateBy90Degree {
    public static void main(String[] args) {

    }
    public void rotateMatrix(int[][] mat) {
        // code here
        int n = mat.length;
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                int temp = mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }

        for(int j=0; j<n; j++){
            for(int i=0, k=n-1; i<k; i++, k--){
                int temp = mat[i][j];
                mat[i][j]=mat[k][j];
                mat[k][j]=temp;
            }
        }
    }

}
