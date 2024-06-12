import java.math.BigInteger;
import java.security.*;
import java.util.*;
import java.lang.*;

public class Test {
    public static void main(String[] args) {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList(
                s.sumSquares(Arrays.asList(1,2,3)) == 6,
                s.sumSquares(Arrays.asList(1,4,9)) == 14,
                s.sumSquares(List.of()) == 0,
                s.sumSquares(Arrays.asList(1,1,1,1,1,1,1,1,1)) == 9,
                s.sumSquares(Arrays.asList(-1,-1,-1,-1,-1,-1,-1,-1,-1)) == -3,
                s.sumSquares(List.of(0)) == 0,
                s.sumSquares(Arrays.asList(-1,-5,2,-1,-5)) == -126,
                s.sumSquares(Arrays.asList(-56,-99,1,0,-2)) == 3030,
                s.sumSquares(Arrays.asList(-1,0,0,0,0,0,0,0,-1)) == 0,
                s.sumSquares(Arrays.asList(-16, -9, -2, 36, 36, 26, -20, 25, -40, 20, -4, 12, -26, 35, 37)) == -14196,
                s.sumSquares(Arrays.asList(-1, -3, 17, -1, -15, 13, -1, 14, -14, -12, -5, 14, -14, 6, 13, 11, 16, 16, 4, 10)) == -1448
        );
        if (correct.contains(false)) {
            throw new AssertionError();
        }
    }
}