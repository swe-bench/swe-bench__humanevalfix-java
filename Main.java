import java.util.*;
import java.lang.*;

class Solution {
    /**
    Given an array of non-negative integers, return a copy of the given array after sorting,
    you will sort the given array in ascending order if the sum( first index value, last index value) is odd,
    or sort it in descending order if the sum( first index value, last index value) is even.

    Note:
    * don't change the given array.

    Examples:
    * sortArray(Arrays.asList()) => []
    * sortArray(Arrays.asList(5)) => [5]
    * sortArray(Arrays.asList(2, 4, 3, 0, 1, 5)) => [0, 1, 2, 3, 4, 5]
    * sortArray(Arrays.asList(2, 4, 3, 0, 1, 5, 6)) => [6, 5, 4, 3, 2, 1, 0]
     */
    public List<Integer> sortArray(List<Integer> array) {

        if (array.size() == 0) {
            return array;
        }
        List<Integer> result = new ArrayList<>(array);
        if ((result.get(0) + result.get(result.size() - 1)) % 2 != 1) {
            Collections.sort(result);
        } else {
            result.sort(Collections.reverseOrder());
        }
        return result;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList(
                s.sortArray(new ArrayList<>(List.of())).equals(List.of()),
                s.sortArray(new ArrayList<>(List.of(5))).equals(List.of(5)),
                s.sortArray(new ArrayList<>(Arrays.asList(2, 4, 3, 0, 1, 5))).equals(Arrays.asList(0, 1, 2, 3, 4, 5)),
                s.sortArray(new ArrayList<>(Arrays.asList(2, 4, 3, 0, 1, 5, 6))).equals(Arrays.asList(6, 5, 4, 3, 2, 1, 0))
        );
        if (correct.contains(false)) {
            throw new AssertionError();
        }
    }
}
