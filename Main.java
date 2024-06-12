import java.util.*;
import java.lang.*;

class Solution {
    /**
    This function will take a list of integers. For all entries in the list, the function shall square the integer entry if its index is a
    multiple of 3 and will cube the integer entry if its index is a multiple of 4 and not a multiple of 3. The function will not
    change the entries in the list whose indexes are not a multiple of 3 or 4. The function shall then return the sum of all entries.

    Examples:
    For lst = [1,2,3] the output should be 6
    For lst = []  the output should be 0
    For lst = [-1,-5,2,-1,-5]  the output should be -126
     */
    public int sumSquares(List<Integer> lst) {

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < lst.size(); i++) {
            if (i % 3 == 0) {
                result.add(lst.get(i) * lst.get(i));
            } else {
                result.add(lst.get(i));
            }
        }
        return result.stream().reduce(Integer::sum).orElse(0);
    }
}
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList(
                s.sumSquares(Arrays.asList(1,2,3)) == 6,
                s.sumSquares(List.of()) == 0,
                s.sumSquares(Arrays.asList(-1,-5,2,-1,-5)) == -126
        );
        if (correct.contains(false)) {
            throw new AssertionError();
        }
    }
}
