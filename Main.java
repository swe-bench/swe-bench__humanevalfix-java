import java.util.*;
import java.lang.*;

class Solution {
    /**
    Given a non-empty list of integers lst. add the even elements that are at odd indices..

    Examples:
        add(Arrays.asList(4, 2, 6, 7)) ==> 2
     */
    public int add(List<Integer> lst) {

        int sum = 0;
        for (int i = 1; i < lst.size(); i += 1) {
            if (lst.get(i) % 2 == 0) {
                sum += lst.get(i);
            }
        }
        return sum;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList(
                s.add(new ArrayList<>(Arrays.asList(4, 2, 6, 7))) == 2
        );
        if (correct.contains(false)) {
            throw new AssertionError();
        }
    }
}
