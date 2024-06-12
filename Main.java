import java.util.*;
import java.lang.*;

class Solution {
    /**
    This function takes a list l and returns a list l' such that
    l' is identical to l in the indicies that are not divisible by three, while its values at the indicies that are divisible by three are equal
    to the values of the corresponding indicies of l, but sorted.
    >>> sortThird(Arrays.asList(1, 2, 3))
    [1, 2, 3]
    >>> sortThird(Arrays.asList(5, 6, 3, 4, 8, 9, 2))
    [2, 6, 3, 4, 8, 9, 5]
     */
    public List<Integer> sortThird(List<Integer> l) {

        List<Integer> thirds = new ArrayList<>();
        for (int i = 0; i < l.size(); i += 3) {
            thirds.add(l.get(i));
        }
        List<Integer> result = l;
        for (int i = 0; i < l.size(); i += 3) {
            result.set(i, thirds.get(i / 3));
        }
        return result;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList(
            s.sortThird(new ArrayList<>(Arrays.asList(1,2,3))).equals(Arrays.asList(1,2,3)),
            s.sortThird(new ArrayList<>(Arrays.asList(5, 6, 3, 4, 8, 9, 2))).equals(Arrays.asList(2, 6, 3, 4, 8, 9, 5))
        );
        if (correct.contains(false)) {
            throw new AssertionError();
        }
    }
}
