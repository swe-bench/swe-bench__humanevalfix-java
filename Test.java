import java.math.BigInteger;
import java.security.*;
import java.util.*;
import java.lang.*;

public class Test {
    public static void main(String[] args) {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList(
                s.greatestCommonDivisor(3, 7) == 1,
                s.greatestCommonDivisor(10, 15) == 5,
                s.greatestCommonDivisor(49, 14) == 7,
                s.greatestCommonDivisor(144, 60) == 12
        );
        if (correct.contains(false)) {
            throw new AssertionError();
        }
    }
}