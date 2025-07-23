package gfg_160;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/*
Given an array of Intervals arr[][], where arr[i] = [starti, endi]. The task is to merge all of the overlapping Intervals.

Problem Note:

You will be given a 2-dimensional array consisting of n rows and 2 columns.
Each row has an interval starting from the value at the first column and ending at a value in the second column.
Two intervals t1 and t2 are said to be overlapping if and only if t2.start <= t1.end
Even if t1 entirely engulfs t2 , it's said to be overlapping.

In a 2D array like int[][] intervals, each element represents a range — typically with a start and end:
int[][] intervals = {
    {1, 3},
    {2, 4},
    {6, 8},
    {9, 10}
};
Each sub-array {start, end} represents an interval on a number line.
Two intervals overlap if their ranges intersect — i.e., the start of one is less than or equal to the end of another.

What’s Overlapping Here?
Let’s examine:
- {1, 3} and {2, 4} overlap because 2 ≤ 3.
- {6, 8} and {9, 10} do not overlap since 9 > 8.

After Merging Overlaps
When merging, overlapping intervals are combined into one:
- {1, 3} and {2, 4} become {1, 4}

Examples:

Input: arr[][] = [[1, 3], [2, 4], [6, 8], [9, 10]]
Output: [[1, 4], [6, 8], [9, 10]]
Explanation: In the given intervals we have only two overlapping intervals here, [1, 3] and [2, 4] which on merging will become [1, 4]. Therefore we will return [[1, 4], [6, 8], [9, 10]].

Input: arr[][] = [[6, 8], [1, 9], [2, 4], [4, 7]]
Output: [[1, 9]]
Explanation: In the given intervals all the intervals overlap with the interval [1, 9]. Therefore we will return [1, 9].

Constraints:
1 ≤ arr.size() ≤ 105
0 ≤ starti ≤ endi ≤ 106
 */
public class Day24_OverlappingIntervals {
    public static void main(String[] args) {
      int arr[][]= {{1,3},{2,4},{6,8},{9,10}};
      ArrayList<int[]> overlappingIntervals = mergeOverlap(arr);
        for (int[] interval : overlappingIntervals) {
            System.out.println("[" + interval[0] + ", " + interval[1] + "]");
        }
    }

    public static ArrayList<int[]> mergeOverlap(int[][] arr) {
        // Code here
        ArrayList<int[]> merged = new ArrayList<>();
        if(arr.length==0)
            return merged;

        //Sorting the intervals based on starting point
        Arrays.sort(arr, new Comparator<int[]>(){
            public int compare(int[] a, int[] b){
                return a[0]-b[0];
            }
        });

        int[] current = arr[0];
        merged.add(current);

        for(int i=1; i<arr.length; i++){
            if(arr[i][0]<=current[1]){
                current[1]=Math.max(current[1], arr[i][1]);
            } else{
                current=arr[i];
                merged.add(current);
            }
        }
        return merged;
    }
}
