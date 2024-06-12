import java.math.BigInteger;
import java.security.*;
import java.util.*;
import java.lang.*;

public class Test {
    public static void main(String[] args) {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList(
                s.sumToN(1) == 1,
                s.sumToN(6) == 21,
                s.sumToN(11) == 66,
                s.sumToN(30) == 465,
                s.sumToN(100) == 5050
        );
        if (correct.contains(false)) {
            throw new AssertionError();
        }
    }
}