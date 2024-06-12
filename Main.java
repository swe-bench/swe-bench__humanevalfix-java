import java.util.*;
import java.lang.*;

class Solution {
    /**
    Write a function vowelsCount which takes a string representing
    a word as input and returns the number of vowels in the string.
    Vowels in this case are 'a', 'e', 'i', 'o', 'u'. Here, 'y' is also a
    vowel, but only when it is at the end of the given word.

    Example:
    >>> vowelsCount("abcde")
    2
    >>> vowelsCount("ACEDY")
    3
     */
    public int vowelsCount(String s) {

        String vowels = "aeiouyAEIOUY";
        int n_vowels = 0;
        for (char c : s.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                n_vowels += 1;
            }
        }
        return n_vowels;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList(
                s.vowelsCount("abcde") == 2,
                s.vowelsCount("ACEDY") == 3
        );
        if (correct.contains(false)) {
            throw new AssertionError();
        }
    }
}
