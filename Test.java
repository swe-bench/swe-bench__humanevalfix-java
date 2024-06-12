import java.math.BigInteger;
import java.security.*;
import java.util.*;
import java.lang.*;

public class Test {
    public static void main(String[] args) {
        Solution s = new Solution();
        List<Boolean> correct = Arrays.asList(
                s.isNested("[[]]" ),
                !s.isNested("[]]]]]]][[[[[]" ),
                !s.isNested("[][]" ),
                !s.isNested("[]" ),
                s.isNested("[[[[]]]]" ),
                !s.isNested("[]]]]]]]]]]" ),
                s.isNested("[][][[]]" ),
                !s.isNested("[[]" ),
                !s.isNested("[]]" ),
                s.isNested("[[]][[" ),
                s.isNested("[[][]]" ),
                !s.isNested("" ),
                !s.isNested("[[[[[[[[" ),
                !s.isNested("]]]]]]]]" )
        );
        if (correct.contains(false)) {
            throw new AssertionError();
        }
    }
}