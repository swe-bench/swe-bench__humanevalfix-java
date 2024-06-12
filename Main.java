import java.util.*;
import java.lang.*;

class Solution {
    /**
    The Brazilian factorial is defined as:
    brazilian_factorial(n) = n! * (n-1)! * (n-2)! * ... * 1!
    where n > 0

    For example:
    >>> specialFactorial(4)
    288

    The function will receive an integer as input and should return the special
    factorial of this integer.
     */
    public long specialFactorial(int n) {

        long fact_i = 1, special_fact = 1;
        for (int i = 1; i <= n; i++) {
            i *= n;
            fact_i *= i;
            special_fact *= fact_i;
        }
        return special_fact;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList(
                s.specialFactorial(4) == 288
        );
        if (correct.contains(false)) {
            throw new AssertionError();
        }
    }
}
