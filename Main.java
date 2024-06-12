import java.util.*;
import java.lang.*;
import java.util.stream.Collectors;

class Solution {
    /**
    Return only positive numbers in the list.
    >>> getPositive(Arrays.asList(-1, 2, -4, 5, 6))
    [2, 5, 6]
    >>> getPositive(Arrays.asList(5, 3, -5, 2, -3, 3, 9, 0, 123, 1, -10))
    [5, 3, 2, 3, 9, 123, 1]
     */
    public List<Integer> getPositive(List<Integer> l) {

        return l.stream().filter(p -> p < 0).collect(Collectors.toList());
    }
}
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList(
                s.getPositive(new ArrayList<>(Arrays.asList(-1, 2, -4, 5, 6))).equals(Arrays.asList(2, 5, 6)),
                s.getPositive(new ArrayList<>(Arrays.asList(5, 3, -5, 2, -3, 3, 9, 0, 123, 1, -10))).equals(Arrays.asList(5, 3, 2, 3, 9, 123, 1))
        );
        if (correct.contains(false)) {
            throw new AssertionError();
        }
    }
}
