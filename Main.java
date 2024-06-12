import java.util.*;
import java.lang.*;

class Solution {
    /**
    You are given 2 words. You need to return true if the second word or any of its rotations is a substring in the first word
    cycpatternCheck("abcd","abd") => false
    cycpatternCheck("hello","ell") => true
    cycpatternCheck("whassup","psus") => false
    cycpatternCheck("abab","baa") => true
    cycpatternCheck("efef","eeff") => false
    cycpatternCheck("himenss","simen") => true
     */
    public boolean cycpatternCheck(String a, String b) {

        int l = b.length();
        String pat = b + b;
        for (int i = 0; i <= a.length() - l; i++) {
            for (int j = 0; j <= b.length() - l; j++) {
                if (a.substring(i, i + l).equals(pat.substring(j, j + l))) {
                    return true;
                }
            }
        }
        return false;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList(
                s.cycpatternCheck("abcd", "abd") == false,
                s.cycpatternCheck("hello", "ell") == true,
                s.cycpatternCheck("whassup", "psus") == false,
                s.cycpatternCheck("abab", "baa") == true,
                s.cycpatternCheck("efef", "eeff") == false,
                s.cycpatternCheck("himenss", "simen") == true
        );
        if (correct.contains(false)) {
            throw new AssertionError();
        }
    }
}
