import java.util.*;
import java.lang.*;

class Solution {
    /**
    Return a string containing space-delimited numbers starting from 0 upto n inclusive.
    >>> stringSequence(0)
    "0"
    >>> stringSequence(5)
    "0 1 2 3 4 5"
     */
    public String stringSequence(int n) {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n-1; i++) {
            sb.append(i);
            sb.append(" ");
        }
        sb.append(n);
        return sb.toString();
    }
}
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList(
                s.stringSequence(0).equals("0"),
                s.stringSequence(5).equals("0 1 2 3 4 5")
        );
        if (correct.contains(false)) {
            throw new AssertionError();
        }
    }
}
