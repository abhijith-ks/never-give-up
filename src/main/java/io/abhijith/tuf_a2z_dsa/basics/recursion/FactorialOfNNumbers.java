package io.abhijith.tuf_a2z_dsa.basics.recursion;

import org.junit.Test;

/**
 * https://takeuforward.org/data-structure/factorial-of-a-number-iterative-and-recursive/
 */
public class FactorialOfNNumbers {

    @Test
    public void test() {
        int n = 5;
        System.out.println("--- Input ---");
        System.out.println(n);
        System.out.println("--- Output ---");
        System.out.println(getFactorial(n));
        System.out.println("\n*** END TEST CASE ***\n");
    }

    private int getFactorial(int n) {
        if(n == 0) {
            return 1;
        }
        return getFactorial(n - 1) * n;
    }
}
