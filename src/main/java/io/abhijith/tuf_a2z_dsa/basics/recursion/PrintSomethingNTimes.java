package io.abhijith.tuf_a2z_dsa.basics.recursion;

import org.junit.Test;

/**
 * https://takeuforward.org/recursion/introduction-to-recursion-understand-recursion-by-printing-something-n-times/
 */
public class PrintSomethingNTimes {

    @Test
    public void test() {
        int n = 10;
        System.out.println("--- Input ---");
        System.out.println(n);
        System.out.println("--- Output ---");
        printTailRecursion(n);
        System.out.println("\n*** END TEST CASE ***\n");

        System.out.println("--- Input ---");
        System.out.println(n);
        System.out.println("--- Output ---");
        printHeadRecursion(n);
        System.out.println("\n*** END TEST CASE ***\n");
    }

    private void printTailRecursion(int n) {
        if(n == 0) {
            return;
        }
        System.out.println("Prints " + n);
        printTailRecursion(n - 1);
    }

    private void printHeadRecursion(int n) {
        if(n == 0) {
            return;
        }
        printHeadRecursion(n - 1);
        System.out.println("Prints " + n);
    }

}
