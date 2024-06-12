import java.util.*;
import java.lang.*;

class Solution {
    /**
    You are given a positive integer n. You have to create an integer array a of length n.
        For each i (1 <= i <= n), the value of a[i] = i * i - i + 1.
        Return the number of triples (a[i], a[j], a[k]) of a where i < j < k,
    and a[i] + a[j] + a[k] is a multiple of 3.

    Example :
        Input: n = 5
        Output: 1
        Explanation:
        a = [1, 3, 7, 13, 21]
        The only valid triple is (1, 7, 13).
     */
    public int getMaxTriples(int n) {

        List<Integer> A = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            A.add(i * i);
        }
        int count = 0;
        for (int i = 0; i < A.size(); i++) {
            for (int j = i + 1; j < A.size(); j++) {
                for (int k = j + 1; k < A.size(); k++) {
                    if ((A.get(i) + A.get(j) + A.get(k)) % 3 == 0) {
                        count += 1;
                    }
                }
            }
        }
        return count;
    }
}
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList(
                s.getMaxTriples(5) == 1
        );
        if (correct.contains(false)) {
            throw new AssertionError();
        }
    }
}
