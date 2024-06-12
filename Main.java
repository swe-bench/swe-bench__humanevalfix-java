import java.util.*;
import java.lang.*;

class Solution {
    /**
    xs represent coefficients of a polynomial.
    xs[0] + xs[1] * x + xs[2] * x^2 + ....
     Return derivative of this polynomial in the same form.
    >>> derivative(Arrays.asList(3, 1, 2, 4, 5))
    [1, 4, 12, 20]
    >>> derivative(Arrays.asList(1, 2, 3]))
    [2, 6]
     */
    public List<Integer> derivative(List<Integer> xs) {

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < xs.size(); i++) {
            result.add(i * xs.get(i));
        }
        return result;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList(
                s.derivative(new ArrayList<>(Arrays.asList(3, 1, 2, 4, 5))).equals(Arrays.asList(1, 4, 12, 20)),
                s.derivative(new ArrayList<>(Arrays.asList(1, 2, 3))).equals(Arrays.asList(2, 6))
        );
        if (correct.contains(false)) {
            throw new AssertionError();
        }
    }
}
