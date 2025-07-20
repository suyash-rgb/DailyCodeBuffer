package gfg_160;
/*
Given an array arr[] denoting the heights of N towers and a positive integer K, you are required to perform one of the following operations for each tower:

Increase the height of the tower by K
Decrease the height of the tower by K
Your task is to find out the minimum possible difference between the height of the tallest and shortest towers after performing the operations on each tower.

Note:
It is compulsory to either increase or decrease the height of the tower by K for each tower.
After the operation, the resultant array should not contain any negative integers.

Input:
k = 2, arr[] = {1, 5, 8, 10}
Output:
5

Explanation:
After performing the operations, the modified heights will be {3, 3, 6, 8}. The difference between the largest and smallest heights is 8 - 3 = 5.

Input:
k = 3, arr[] = {3, 9, 12, 16, 20}
Output:
11

Explanation:
After performing the operations, the modified heights will be {6, 12, 9, 13, 17}. The difference between the largest and smallest heights is 17 - 6 = 11.

Constraints:
1 ≤ k ≤ 10^7
1 ≤ n ≤ 10^5
1 ≤ arr[i] ≤ 10^7
 */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Day9_MinimizeTheHeightsII {
    public static void main(String[] args) {

    }

    // Greedy Approach
    public static int getMinDiff(int[] arr, int k) {
        int n = arr.length;
        List<int[]> modifiedHeights = new ArrayList<>();
        int[] frequency = new int[n];

        for (int i = 0; i < n; i++) {
            if (arr[i] - k >= 0) {
                modifiedHeights.add(new int[]{arr[i] - k, i});
            }
            modifiedHeights.add(new int[]{arr[i] + k, i});
        }

        modifiedHeights.sort(Comparator.comparingInt(a -> a[0]));

        int left = 0, right = 0, covered = 0, minDifference = Integer.MAX_VALUE;

        while (right < modifiedHeights.size()) {
            if (frequency[modifiedHeights.get(right)[1]]++ == 0) {
                covered++;
            }

            while (covered == n) {
                minDifference = Math.min(minDifference, modifiedHeights.get(right)[0] - modifiedHeights.get(left)[0]);

                if (--frequency[modifiedHeights.get(left)[1]] == 0) {
                    covered--;
                }
                left++;
            }
            right++;
        }

        return minDifference;
    }

    //Aternate Solution - arbitrary partition point where values to the left are increased and to the right are decreased.
    public static int getMinDiffAlternate(int[] arr, int k) {
        int n = arr.length;
        if (n == 1) return 0;

        Arrays.sort(arr);

        int minDiff = arr[n - 1] - arr[0];  // Initial difference without modifications
        int smallest = arr[0] + k;
        int largest = arr[n - 1] - k;

        for (int i = 1; i < n; i++) {
            if (arr[i] - k < 0) continue;  // Skip if decreasing leads to a negative height

            int min = Math.min(smallest, arr[i] - k);
            int max = Math.max(largest, arr[i - 1] + k);

            minDiff = Math.min(minDiff, max - min);
        }

        return minDiff;
    }

}
