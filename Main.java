import java.util.*;
import java.lang.*;

class Solution {
    /**
    Circular shift the digits of the integer x, shift the digits right by shift
    and return the result as a string.
    If shift > number of digits, return digits reversed.
    >>> circularShift(12, 1)
    "21"
    >>> circularShift(12, 2)
    "12"
     */
    public String circularShift(int x, int shift) {

        String s = String.valueOf(x);
        if (shift > s.length()) {
            return new StringBuilder(s).reverse().toString();
        } else {
            return s.substring(0, s.length() - shift) + s.substring(s.length() - shift);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList(
                s.circularShift(12, 2).equals("12"),
                s.circularShift(12, 1).equals("21")
        );
        if (correct.contains(false)) {
            throw new AssertionError();
        }
    }
}
