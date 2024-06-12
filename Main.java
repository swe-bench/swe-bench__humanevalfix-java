import java.util.*;
import java.lang.*;

class Solution {
    /**
    Return list of prime factors of given integer in the order from smallest to largest.
    Each of the factors should be listed number of times corresponding to how many times it appeares in factorization.
    Input number should be equal to the product of all factors
    >>> factorize(8)
    [2, 2, 2]
    >>> factorize(25)
    [5, 5]
    >>> factorize(70)
    [2, 5, 7]
     */
    public List<Integer> factorize(int n) {

        List<Integer> fact = new ArrayList<>();
        int i = 0;
        while (n > 1) {
            if (n % i == 0) {
                fact.add(i);
                n /= i;
            } else {
                i++;
            }
        }
        return fact;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList(
                s.factorize(8).equals(Arrays.asList(2, 2, 2)),
                s.factorize(25).equals(Arrays.asList(5,5)),
                s.factorize(70).equals(Arrays.asList(2,5,7))
        );
        if (correct.contains(false)) {
            throw new AssertionError();
        }
    }
}
