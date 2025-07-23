package gfg_160;
/*
K-th element of two Arrays

Given two sorted arrays a[] and b[] and an element k, the task is to find the element that would be at the kth position of the combined sorted array.

Examples :

Input: a[] = [2, 3, 6, 7, 9], b[] = [1, 4, 8, 10], k = 5
Output: 6
Explanation: The final combined sorted array would be [1, 2, 3, 4, 6, 7, 8, 9, 10]. The 5th element of this array is 6.

Input: a[] = [100, 112, 256, 349, 770], b[] = [72, 86, 113, 119, 265, 445, 892], k = 7
Output: 256
Explanation: Combined sorted array is [72, 86, 100, 112, 113, 119, 256, 265, 349, 445, 770, 892]. The 7th element of this array is 256.

Constraints:

1 <= a.size(), b.size() <= 106
1 <= k <= a.size() + b.size()
0 <= a[i], b[i] < 108
 */
public class Day32_KthElementOfTwoArrays {
    public static void main(String[] args) {
        int[] a={2, 3, 6, 7, 9}, b={1, 4, 8, 10};
        int k=5;

    }
    public int kthElement(int[] a, int[] b, int k) {
        if (a.length > b.length) return kthElement(b, a, k);

        int n = a.length, m = b.length, low = Math.max(0, k - m), high = Math.min(k, n);

        while (low <= high) {
            int cut1 = (low + high) / 2;
            int cut2 = k - cut1;

            int l1 = (cut1 > 0) ? a[cut1 - 1] : Integer.MIN_VALUE;
            int l2 = (cut2 > 0) ? b[cut2 - 1] : Integer.MIN_VALUE;
            int r1 = (cut1 < n) ? a[cut1] : Integer.MAX_VALUE;
            int r2 = (cut2 < m) ? b[cut2] : Integer.MAX_VALUE;

            if (l1 <= r2 && l2 <= r1) {
                return Math.max(l1, l2);
            } else if (l1 > r2) {
                high = cut1 - 1;
            } else {
                low = cut1 + 1;
            }
        }

        return -1;
    }
}
