package io.abhijith.tuf_a2z_dsa.basics.recursion;

import org.junit.Test;

/**
 * https://takeuforward.org/arrays/print-fibonacci-series-up-to-nth-term/
 */
public class FibonacciUptoN {

    @Test
    public void test() {
        int n = 10;
        System.out.println("--- Input ---");
        System.out.println(n);
        System.out.println("--- Output ---");
        System.out.print("0 1 ");
        fibonacci(0, 1, 10 - 2);
        System.out.println("\n*** END TEST CASE ***\n");
    }

    private void fibonacci(int prev, int curr, int n) {
        if(n == 0) return;
        System.out.print((prev + curr ) + " ");
        fibonacci(curr, prev + curr, --n);
    }
}
