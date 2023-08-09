package io.abhijith.tuf_a2z_dsa.basics.recursion;

import org.junit.Test;

/**
 * https://takeuforward.org/data-structure/sum-of-first-n-natural-numbers/
 */
public class SumOfFirstNNaturalNumbers {

    @Test
    public void test() {
        int n = 10;
        System.out.println("--- Input ---");
        System.out.println(n);
        System.out.println("--- Output ---");
        System.out.println(findSum(n));
        System.out.println("\n*** END TEST CASE ***\n");
    }

    private int findSum(int n) {
        if(n == 0) {
            return 0;
        }
        return n + findSum(n - 1);
    }

}
