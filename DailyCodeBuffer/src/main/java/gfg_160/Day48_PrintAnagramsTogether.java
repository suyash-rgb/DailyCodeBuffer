package gfg_160;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
Given an array of strings, return all groups of strings that are anagrams. The strings in each group must be arranged in the order of their appearance in the original array. Refer to the sample case for clarification.

Examples:

Input: arr[] = ["act", "god", "cat", "dog", "tac"]
Output: [["act", "cat", "tac"], ["god", "dog"]]
Explanation: There are 2 groups of anagrams "god", "dog" make group 1. "act", "cat", "tac" make group 2.

Input: arr[] = ["no", "on", "is"]
Output: [["is"], ["no", "on"]]
Explanation: There are 2 groups of anagrams "is" makes group 1. "no", "on" make group 2.

Input: arr[] = ["listen", "silent", "enlist", "abc", "cab", "bac", "rat", "tar", "art"]
Output: [["abc", "cab", "bac"], ["listen", "silent", "enlist"], ["rat", "tar", "art"]]
Explanation:
Group 1: "abc", "bac", and "cab" are anagrams.
Group 2: "listen", "silent", and "enlist" are anagrams.
Group 3: "rat", "tar", and "art" are anagrams.

Constraints:
1<= arr.size() <=100
1<= arr[i].size() <=10
 */
public class Day48_PrintAnagramsTogether {
    public static void main(String[] args) {

    }
    public ArrayList<ArrayList<String>> anagrams(String[] arr) {
        // code here
        Map<String, ArrayList<String>> umap = new HashMap<>();
        for(String s : arr){
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String sorted_s = new String(chars);
            umap.computeIfAbsent(sorted_s, k-> new ArrayList<>()).add(s);
        }
        ArrayList<ArrayList<String>> result = new ArrayList<>(umap.values());
        return result;
    }
}
