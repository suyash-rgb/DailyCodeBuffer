package gfg_160;

/*
You are given an array of integer arr[] where each number represents a vote to a candidate. Return the candidates that have votes greater than one-third of the total votes, If there's not a majority vote, return an empty array.

Note: The answer should be returned in an increasing format.

Examples:

Input: arr[] = [2, 1, 5, 5, 5, 5, 6, 6, 6, 6, 6]
Output: [5, 6]
Explanation: 5 and 6 occur more n/3 times.

Input: arr[] = [1, 2, 3, 4, 5]
Output: []
Explanation: The total number of votes are 5. No candidate occur more than floor (5/3) times.

Constraint:
1 <= arr.size() <= 106
1 <= arr[i] <= 105
 */

import java.util.ArrayList;
import java.util.Collections;

public class Day6_MajorityElementII {

    public static void main(String[] args) {
        int[] arr = {2,1,5,5,5,5,6,6,6,6};
        ArrayList<Integer> majorityElements = findMajority(arr);
        System.out.println(majorityElements);
    }

    public static ArrayList<Integer> findMajority(int[] arr) {
        ArrayList<Integer> result = new ArrayList<> ();
        int n = arr.length;
        if(n==0)
            return result;

        // Boyer–Moore majority vote – extended for n/3 threshold
        int candidate1 =0, candidate2=1;
        int count1=0, count2=0;

        for(int num: arr){
            if(num==candidate1){
                count1++;
            } else if(num == candidate2){
                count2++;
            } else if(count1==0){
                candidate1=num;
                count1=1;
            } else if(count2==0){
                candidate2=num;
                count2=1;
            } else {
                count1--;
                count2--;
            }
        }
        // Verify actual counts
        count1=0;
        count2=0;
        for(int num: arr){
            if(num==candidate1)
                count1++;
            else if(num==candidate2)
                count2++;
        }

        //collect candidates exceeding n/3
        if(count1>n/3)
            result.add(candidate1);
        if(count2>n/3)
            result.add(candidate2);

        Collections.sort(result);
        return result;

    }



    /* For GFG
    class Solution {
    public ArrayList<Integer> findMajority(int[] arr) {
       ArrayList<Integer> result = new ArrayList<> ();
       int n = arr.length;
       if(n==0)
        return result;

       int candidate1 =0, candidate2=1;
       int count1=0, count2=0;

       for(int num: arr){
           if(num==candidate1){
               count1++;
           } else if(num == candidate2){
               count2++;
           } else if(count1==0){
               candidate1=num;
               count1=1;
           } else if(count2==0){
               candidate2=num;
               count2=1;
           } else {
               count1--;
               count2--;
           }
       }
       // Verify actual counts
       count1=0;
       count2=0;
       for(int num: arr){
           if(num==candidate1)
             count1++;
            else if(num==candidate2)
             count2++;
       }

       //collect candidates exceeding n/3
       if(count1>n/3)
         result.add(candidate1);
       if(count2>n/3)
         result.add(candidate2);

       Collections.sort(result);
       return result;

    }
}
*/

}
