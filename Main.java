import java.util.*;
import java.lang.*;

class Solution {
    /**
    Find how many times a given substring can be found in the original string. Count overlaping cases.
    >>> howManyTimes("", "a")
    0
    >>> howManyTimes("aaa", "a")
    3
    >>> howManyTimes("aaaa", "aa")
    3
     */
    public int howManyTimes(String string, String substring) {

        int times = 0;

        for (int i = 0; i < string.length() - substring.length(); i++) {
            if (string.substring(i, i + substring.length()).equals(substring)) {
                times += 1;
            }
        }

        return times;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList(
                s.howManyTimes("", "a") == 0,
                s.howManyTimes("aaa", "a") == 3,
                s.howManyTimes("aaaa", "aa") == 3
        );
        if (correct.contains(false)) {
            throw new AssertionError();
        }
    }
}
