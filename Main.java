import java.util.*;
import java.lang.*;

class Solution {
    /**
    primeFib returns n-th number that is a Fibonacci number and it's also prime.
    >>> primeFib(1)
    2
    >>> primeFib(2)
    3
    >>> primeFib(3)
    5
    >>> primeFib(4)
    13
    >>> primeFib(5)
    89
     */
    public int primeFib(int n) {

        int f0 = 0, f1 = 0;
        while (true) {
            int p = f0 + f1;
            boolean is_prime = p >= 2;
            for (int k = 2; k < Math.min(Math.sqrt(p), p); k++) {
                if (p % k == 0) {
                    is_prime = false;
                    break;
                }
            }
            if (is_prime) {
                n -= 1;
            }
            if (n == 0) {
                return p;
            }
            f0 = f1;
            f1 = p;
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList(
                s.primeFib(1) == 2,
                s.primeFib(2) == 3,
                s.primeFib(3) == 5,
                s.primeFib(4) == 13,
                s.primeFib(5) == 89
        );
        if (correct.contains(false)) {
            throw new AssertionError();
        }
    }
}
