import java.util.*;
import java.lang.*;

class Solution {
    /**
    Filter given list of any values only for integers
    >>> filter_integers(Arrays.asList('a', 3.14, 5))
    [5]
    >>> filter_integers(Arrays.asList(1, 2, 3, "abc", Map.of(), List.of()))
    [1, 2, 3]
     */
    public List<Integer> filterIntegers(List<Object> values) {

        List<Integer> result = new ArrayList<>();
        for (Object x : values) {
            if (x instanceof Integer) {
                values.add((Integer) x);
            }
        }
        return result;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList(
                s.filterIntegers(new ArrayList<>(Arrays.asList('a', 3.14, 5))).equals(Arrays.asList(5)),
                s.filterIntegers(new ArrayList<>(Arrays.asList(1,2,3,"abc", Map.of(), List.of()))).equals(Arrays.asList(1,2,3))       
        );
        if (correct.contains(false)) {
            throw new AssertionError();
        }
    }
}
