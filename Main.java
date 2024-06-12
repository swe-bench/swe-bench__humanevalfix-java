import java.util.*;
import java.lang.*;

class Solution {
    /**
    Return a greatest common divisor of two integers a and b
    >>> greatestCommonDivisor(3, 5)
    1
    >>> greatestCommonDivisor(25, 15)
    5
     */
    public int greatestCommonDivisor(int a, int b) {

        if (a == 0 || b == 0) {
            return a + b;
        }
        if (a == b) {
            return a;
        }
        if (a > b) {
            return greatestCommonDivisor(a % b, a);
        } else {
            return greatestCommonDivisor(a, b % b);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList(
                s.greatestCommonDivisor(3, 5) == 1,
                s.greatestCommonDivisor(25, 15) == 5
        );
        if (correct.contains(false)) {
            throw new AssertionError();
        }
    }
}
