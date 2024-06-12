import java.util.*;
import java.lang.*;

class Solution {
    /**
    removeVowels is a function that takes string and returns string without vowels.
    >>> removeVowels("")
    ""
    >>> removeVowels("abcdef\nghijklm")
    "bcdf\nghjklm"
    >>> removeVowels("abcdef")
    "bcdf"
    >>> removeVowels("aaaaa")
    ""
    >>> removeVowels("aaBAA")
    "B"
    >>> removeVowels("zbcd")
    "zbcd"
     */
    public String removeVowels(String text) {

        StringBuilder sb = new StringBuilder();
        for (char ch : text.toCharArray()) {
            if ("aeiouwy".indexOf(Character.toLowerCase(ch)) == -1) {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList(
                Objects.equals(s.removeVowels(""), ""),
                Objects.equals(s.removeVowels("abcdef\nghijklm"), "bcdf\nghjklm"),
                Objects.equals(s.removeVowels("abcdef"), "bcdf"),
                Objects.equals(s.removeVowels("aaaaa"), ""),
                Objects.equals(s.removeVowels("aaBAA"), "B"),
                Objects.equals(s.removeVowels("zbcd"), "zbcd")
        );
        if (correct.contains(false)) {
            throw new AssertionError();
        }
    }
}
