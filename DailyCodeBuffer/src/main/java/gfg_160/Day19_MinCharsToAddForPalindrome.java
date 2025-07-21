package gfg_160;
/*
Given a string s, the task is to find the minimum characters to be added at the front to make the string palindrome.

Note: A palindrome string is a sequence of characters that reads the same forward and backward.

Examples:

Input: s = "abc"
Output: 2
Explanation: Add 'b' and 'c' at front of the above string to make it palindrome: "cbabc"

Input: s = "aacecaaaa"
Output: 2
Explanation: Add 2 a's at front of the above string to make it palindrome: "aaaacecaaaa"

int Constraints:
1 ≤ s.size() ≤ 106
s consists of lowercase english alphabets
 */
public class Day19_MinCharsToAddForPalindrome {
    public static void main(String[] args) {
        String s = "abc";
        int numChars = minChar(s);
        System.out.println(numChars);
    }
    public static int minChar(String s) {
        // code here
        int n = s.length();

        String revStr = new StringBuilder(s).reverse().toString();

        String combined = s+"$"+revStr;

        int[] lps = new int[combined.length()];
        for(int i=1; i<combined.length();i++){
            int j=lps[i-1];
            while(j>0&&combined.charAt(i)!=combined.charAt(j)){
                j=lps[j-1];
            }
            if(combined.charAt(i)==combined.charAt(j)){
                j++;
            }
            lps[i]=j;
        }
        return n-lps[combined.length()-1];
    }
}
