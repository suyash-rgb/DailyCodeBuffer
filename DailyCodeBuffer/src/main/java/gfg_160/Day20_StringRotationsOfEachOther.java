package gfg_160;
/*
You are given two strings s1 and s2, of equal lengths. The task is to check if s2 is a rotated version of the string s1.

Note: A string is a rotation of another if it can be formed by moving characters from the start to the end (or vice versa) without rearranging them.

Examples :

Input: s1 = "abcd", s2 = "cdab"
Output: true
Explanation: After 2 right rotations, s1 will become equal to s2.

Input: s1 = "aab", s2 = "aba"
Output: true
Explanation: After 1 left rotation, s1 will become equal to s2.

Input: s1 = "abcd", s2 = "acbd"
Output: false
Explanation: Strings are not rotations of each other.

Constraints:
1 ≤ s1.size(), s2.size() ≤ 105
s1, s2 consists of lowercase English alphabets.
 */
public class Day20_StringRotationsOfEachOther {
    public static void main(String[] args) {
        String s1 = "abcd", s2 = "cdab";
        boolean result = areRotations(s1, s2);
        System.out.println(result);
    }

    public static boolean areRotations(String s1, String s2) {
            if(s1.length()!=s2.length())
                return false;
            String temp = s1+s1;
            return kmpSearch(temp, s2);
    }

    private static boolean kmpSearch(String text, String pattern){
            int[] lps = computeLPSArray(pattern);
            int i=0, j=0;

            while(i<text.length()){
                if(text.charAt(i)==pattern.charAt(j)){
                    i++;
                    j++;

                    if(j==pattern.length()){
                        return true;
                    }
                } else {
                    if(j!=0){
                        j=lps[j-1];
                    } else{
                        i++;
                    }
                }
            }
            return false;
    }

    private static int[] computeLPSArray(String pattern){
            int[] lps = new int[pattern.length()];
            int len=0, i=1;

            while(i<pattern.length()){
                if(pattern.charAt(i)==pattern.charAt(len)){
                    len++;
                    lps[i]=len;
                    i++;
                } else {
                    if(len!=0){
                        len=lps[len-1];
                    } else{
                        lps[i]=0;
                        i++;
                    }
                }
            }
            return lps;
    }
}
