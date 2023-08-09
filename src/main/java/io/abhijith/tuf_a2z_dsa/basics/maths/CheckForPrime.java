package io.abhijith.tuf_a2z_dsa.basics.maths;

import org.junit.Test;

/**
 * https://takeuforward.org/data-structure/check-if-a-number-is-prime-or-not/
 */
public class CheckForPrime {

    @Test
    public void test() {
        int n = 20;
        System.out.println("--- Input ---");
        System.out.println(n);
        System.out.println("--- Output ---");
        System.out.println(isPrime(n));
        System.out.println("\n*** END TEST CASE ***\n");

        n = 7;
        System.out.println("--- Input ---");
        System.out.println(n);
        System.out.println("--- Output ---");
        System.out.println(isPrime(n));
        System.out.println("\n*** END TEST CASE ***\n");
    }

    private boolean isPrime(int n) {
        if(n == 1) return false;
        for(int i = 2; i < Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
