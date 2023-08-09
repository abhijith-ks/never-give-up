package io.abhijith.tuf_a2z_dsa.basics.maths;

import org.junit.Test;

/**
 * https://takeuforward.org/data-structure/print-all-divisors-of-a-given-number/
 */
public class PrintAllDivisors {

    @Test
    public void test() {
        int x = 36;
        System.out.println("--- Input ---");
        System.out.println(x);
        System.out.println("--- Output ---");
        printDivisors(x);
        System.out.println("\n*** END TEST CASE ***\n");

        x = 49;
        System.out.println("--- Input ---");
        System.out.println(x);
        System.out.println("--- Output ---");
        printDivisors(x);
        System.out.println("\n*** END TEST CASE ***\n");
    }

    private void printDivisors(int n) {
        for(int i = 1; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                System.out.print(i + " ");
                if(n/i != i) System.out.print(n/i + " ");
            }
        }
    }
}
