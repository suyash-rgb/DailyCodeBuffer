package gfg_160;

import java.util.Arrays;
import java.util.Comparator;
/*
Given a 2D array intervals[][], where intervals[i] = [starti, endi]. Return the minimum number of intervals you need to remove to make the rest of the intervals non-overlapping.

Note: Two intervals are considered non-overlapping if the end time of one interval is less than or equal to the start time of the next interval.

Examples:

Input: intervals[][] = [[1, 2], [2, 3], [3, 4], [1, 3]]
Output: 1
Explanation: [1, 3] can be removed and the rest of the intervals are non-overlapping.

Input: intervals[][] = [[1, 3], [1, 3], [1, 3]]
Output: 2
Explanation: You need to remove two [1, 3] to make the rest of the intervals non-overlapping.

Input: intervals[][] = [[1, 2], [5, 10], [18, 35], [40, 45]]
Output: 0
Explanation: All intervals are already non-overlapping.

Constraints:
1 ≤ intervals.size() ≤  105
0 ≤ starti < endi ≤ 5*104
 */
public class Day26_NonOverlappingIntervals {
    public static void main(String[] args) {
        int[][] intervals= {{1,2},{2,3},{3,4},{1,3}};
        int result = minRemoval(intervals);
        System.out.println(result);
    }

    public static int minRemoval(int intervals[][]) {
        // code here
        Arrays.sort(intervals, new Comparator<int[]>(){
            @Override
            public int compare(int[] a, int[] b){
                return Integer.compare(a[0], b[0]);
            }
        });

        int count =0, prevEnd = intervals[0][1];

        for(int i=1; i<intervals.length;i++){
            if(intervals[i][0]<prevEnd){
                count++;
                prevEnd=Math.min(prevEnd, intervals[i][1]);
            } else {
                prevEnd = intervals[i][1];
            }
        }
        return count;
    }
}
