import java.util.*;
import java.lang.*;

class Solution {
    /**
    You are given a list of numbers.
    You need to return the sum of squared numbers in the given list,
    round each element in the list to the upper int(Ceiling) first.
    Examples:
    For lst = [1,2,3] the output should be 14
    For lst = [1,4,9] the output should be 98
    For lst = [1,3,5,7] the output should be 84
    For lst = [1.4,4.2,0] the output should be 29
    For lst = [-2.4,1,1] the output should be 6
     */
    public int sumSquares(List<Double> lst) {

        return lst.stream().map(p -> (int) Math.ceil(p)).map(p -> p * 2).reduce(Integer::sum).get();
    }
}
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList(
                s.sumSquares(Arrays.asList(1., 2., 3.)) == 14,
                s.sumSquares(Arrays.asList(1., 4., 9.)) == 98,
                s.sumSquares(Arrays.asList(1., 3., 5., 7.)) == 84,
                s.sumSquares(Arrays.asList(1.4, 4.2, 0.)) == 29,
                s.sumSquares(Arrays.asList(-2.4, 1., 1.)) == 6
        );
        if (correct.contains(false)) {
            throw new AssertionError();
        }
    }
}
