import java.util.*;
import java.lang.*;

class Solution {
    /**
    For a given list of integers, return a tuple consisting of a sum and a product of all the integers in a list.
    Empty sum should be equal to 0 and empty product should be equal to 1.
    >>> sumProduct(List.of())
    [0, 1]
    >>> sumProduct(Arrays.asList(1, 2, 3, 4))
    [10, 24]
     */
    public List<Integer> sumProduct(List<Integer> numbers) {

        int sum = 0;
        int product = 0;

        for (int n : numbers) {
            sum += n;
            product *= n;
        }
        return Arrays.asList(sum, product);
    }
}
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList(
                s.sumProduct(new ArrayList<>(List.of())).equals(Arrays.asList(0, 1)),
                s.sumProduct(new ArrayList<>(Arrays.asList(1, 2, 3,4))).equals(Arrays.asList(10, 24))
        );
        if (correct.contains(false)) {
            throw new AssertionError();
        }
    }
}
