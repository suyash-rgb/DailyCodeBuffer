package gfg_160;
/*
You are given a 2D matrix mat[][] of size n x m. The task is to modify the matrix such that if mat[i][j] is 0, all the elements in the i-th row and j-th column are set to 0 and do it in constant space complexity.
 */
public class Day41_SetMatrixZeroes {
    public static void main(String[] args) {

    }
    public static void setMatrixZeroes(int[][] mat) {
        // code here
        int n=mat.length, m=mat[0].length, col0=1;
        for(int i=0; i<n; i++){
            if(mat[i][0]==0)
                col0=0;
            for(int j=1; j<m;j++)
                if(mat[i][j]==0)
                    mat[i][0]=mat[0][j]=0;
        }
        for(int i=n-1; i>=0; i--){
            for(int j=m-1; j>=1;j--)
                if(mat[i][0]==0||mat[0][j]==0)
                    mat[i][j]=0;
            if(col0==0)
                mat[i][0]=0;
        }
    }
}
