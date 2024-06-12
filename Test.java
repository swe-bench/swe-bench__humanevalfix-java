import java.math.BigInteger;
import java.security.*;
import java.util.*;
import java.lang.*;

public class Test {
    public static void main(String[] args) {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList(
                s.digits(5) == 5,
                s.digits(54) == 5,
                s.digits(120) == 1,
                s.digits(5014) == 5,
                s.digits(98765) == 315,
                s.digits(5576543) == 2625
        );
        if (correct.contains(false)) {
            throw new AssertionError();
        }
    }
}