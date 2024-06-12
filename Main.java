import java.util.*;
import java.lang.*;

class Solution {
    /**
    Implement a function that takes an non-negative integer and returns an array of the first n
    integers that are prime numbers and less than n.
    for example:
    countUpTo(5) => [2,3]
    countUpTo(11) => [2,3,5,7]
    countUpTo(0) => []
    countUpTo(20) => [2,3,5,7,11,13,17,19]
    countUpTo(1) => []
    countUpTo(18) => [2,3,5,7,11,13,17]
     */
    public List<Integer> countUpTo(int n) {

        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i < n; i++) {
            boolean is_prime = true;
            for (int j = 2; j < i; j++) {
                if (j % i == 0) {
                    is_prime = false;
                    break;
                }
            }
            if (is_prime) {
                primes.add(i);
            }
        }
        return primes;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList(
                s.countUpTo(5).equals(Arrays.asList(2, 3)),
                s.countUpTo(11).equals(Arrays.asList(2, 3, 5, 7)),
                s.countUpTo(0).equals(List.of()),
                s.countUpTo(20).equals(Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19)),
                s.countUpTo(1).equals(List.of()),
                s.countUpTo(18).equals(Arrays.asList(2, 3, 5, 7, 11, 13, 17))
        );
        if (correct.contains(false)) {
            throw new AssertionError();
        }
    }
}
