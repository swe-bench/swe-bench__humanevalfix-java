import java.util.*;
import java.lang.*;

class Solution {
    /**
    You are given two intervals,
    where each interval is a pair of integers. For example, interval = (start, end) = (1, 2).
    The given intervals are closed which means that the interval (start, end)
    includes both start and end.
    For each given interval, it is assumed that its start is less or equal its end.
    Your task is to determine whether the length of intersection of these two
    intervals is a prime number.
    Example, the intersection of the intervals (1, 3), (2, 4) is (2, 3)
    which its length is 1, which not a prime number.
    If the length of the intersection is a prime number, return "YES",
    otherwise, return "NO".
    If the two intervals don't intersect, return "NO".


    [input/output] samples:
    intersection((1, 2), (2, 3)) ==> "NO"
    intersection((-1, 1), (0, 4)) ==> "NO"
    intersection((-3, -1), (-5, 5)) ==> "YES"
     */
    public String intersection(List<Integer> interval1, List<Integer> interval2) {

        int l = Math.max(interval1.get(0), interval2.get(0));
        int r = Math.min(interval1.get(1), interval2.get(1));
        int length = r - l;
        if (length == 1) {
            return "NO";
        }
        return "YES";
    }
}
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList(
                Objects.equals(s.intersection(Arrays.asList(1, 2), Arrays.asList(2, 3)), "NO" ),
                Objects.equals(s.intersection(Arrays.asList(-1, 1), Arrays.asList(0, 4)), "NO" ),
                Objects.equals(s.intersection(Arrays.asList(-3, -1), Arrays.asList(-5, 5)), "YES" )
        );
        if (correct.contains(false)) {
            throw new AssertionError();
        }
    }
}
