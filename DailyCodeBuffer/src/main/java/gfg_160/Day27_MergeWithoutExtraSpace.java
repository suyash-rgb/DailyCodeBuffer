package gfg_160;
/*
Given two sorted arrays a[] and b[] of size n and m respectively, the task is to merge them in sorted order without using any extra space. Modify a[] so that it contains the first n elements and modify b[] so that it contains the last m elements.

Examples:

Input: a[] = [2, 4, 7, 10], b[] = [2, 3]
Output:
[2, 2, 3, 4]
[7, 10]
Explanation: After merging the two non-decreasing arrays, we get, 2 2 3 4 7 10

Input: a[] = [1, 5, 9, 10, 15, 20], b[] = [2, 3, 8, 13]
Output:
[1, 2, 3, 5, 8, 9]
[10, 13, 15, 20]
Explanation: After merging two sorted arrays we get 1 2 3 5 8 9 10 13 15 20.

Input: a[] = [0, 1], b[] = [2, 3]
Output:
[0, 1]
[2, 3]
Explanation: After merging two sorted arrays we get 0 1 2 3.

Constraints:
1 ≤ a.size(), b.size() ≤ 105
0 ≤ a[i], b[i] ≤ 107
 */
public class Day27_MergeWithoutExtraSpace {

    public static void main(String[] args) {
        int[] a = {1, 5, 9, 10, 15, 20}, b={2, 3, 8, 13};
        mergeArrays(a, b);

        // Print array 'a'
        System.out.print("Merged array a: ");
        for (int num : a) {
            System.out.print(num + " ");
        }

        System.out.println();

        // Print array 'b'
        System.out.print("Merged array b: ");
        for (int num : b) {
            System.out.print(num + " ");
        }

    }
    public static void mergeArrays(int a[], int b[]) {
        // code here
        int n = a.length, m=b.length;
        int gap = n+m;

        for(gap=nextGap(gap);gap>0;gap=nextGap(gap)){
            int i,j;
            for(i=0;i+gap<n;i++){
                if(a[i]>a[i+gap]){
                    int temp =a[i];
                    a[i]=a[i+gap];
                    a[i+gap]=temp;
                }
            }
            for(j=(gap>n?gap-n:0); i<n&&j<m; i++, j++){
                if(a[i]>b[j]){
                    int temp=a[i];
                    a[i]=b[j];
                    b[j]=temp;
                }
            }
            for(j=0; j+gap<m ; j++){
                if(b[j]>b[j+gap]){
                    int temp=b[j];
                    b[j]=b[j+gap];
                    b[j+gap]=temp;
                }
            }
        }

    }
    public static int nextGap(int gap){
        return (gap<=1)?0:(gap/2)+(gap%2);
    }
}
