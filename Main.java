import java.util.*;
import java.lang.*;

class Solution {
    /**
    Return the largest prime factor of n. Assume n > 1 and is not a prime.
    >>> largestPrimeFactor(13195)
    29
    >>> largestPrimeFactor(2048)
    2
     */
    public int largestPrimeFactor(int n) {

        int largest = 1;
        for (int j = 2; j <= n; j++) {
            if (n % j == 0) {
                boolean is_prime = j >= 2;
                for (int i = 2; i < j - 1; i++) {
                    if (n % i == 0) {
                        is_prime = false;
                        break;
                    }
                }
                if (is_prime) {
                    largest = Math.max(largest, j);
                }
            }
        }
        return largest;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList(
                s.largestPrimeFactor(2048) ==2,
                s.largestPrimeFactor(13195) == 29
        );
        if (correct.contains(false)) {
            throw new AssertionError();
        }
    }
}
