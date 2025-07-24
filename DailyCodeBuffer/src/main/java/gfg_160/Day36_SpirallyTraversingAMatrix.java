package gfg_160;

import java.util.ArrayList;

/*
You are given a rectangular matrix mat[][] of size n x m, and your task is to return an array while traversing the matrix in spiral form.

Input: mat[][] = [[2, 7, 10],
                [5, 1, 3],
                [4, 2, 8]]
Output: [2, 7, 10, 3, 8, 2, 4, 5, 1]
Explanation: Applying same technique as shown above.

Input: mat[][] = [[32, 44, 27, 23],
                [54, 28, 50, 62]]
Output: [32, 44, 27, 23, 62, 50, 28, 54]
Explanation: Applying same technique as shown above, output will be [32, 44, 27, 23, 62, 50, 28, 54].
 */
public class Day36_SpirallyTraversingAMatrix {
    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        ArrayList<Integer> result = spirallyTraverse(mat);
        for(int x: result){
            System.out.println(x);
        }

    }
    public static ArrayList<Integer> spirallyTraverse(int[][] mat) {
        ArrayList<Integer> result = new ArrayList<>();
        int top = 0, left = 0, bottom = mat.length - 1, right = mat[0].length - 1;

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) result.add(mat[top][i]);
            top++;
            for (int i = top; i <= bottom; i++) result.add(mat[i][right]);
            right--;
            if (top <= bottom)
                for (int i = right; i >= left; i--) result.add(mat[bottom][i]);
            bottom--;
            if (left <= right)
                for (int i = bottom; i >= top; i--) result.add(mat[i][left]);
            left++;
        }
        return result;
    }

}
