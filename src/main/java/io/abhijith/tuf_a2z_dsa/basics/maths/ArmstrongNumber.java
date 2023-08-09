package io.abhijith.tuf_a2z_dsa.basics.maths;

import org.junit.Test;

/**
 * https://leetcode.com/submissions/detail/1009028546/
 * https://takeuforward.org/maths/check-if-a-number-is-armstrong-number-or-not/
 */
public class ArmstrongNumber {

    @Test
    public void test() {
        int n = 153;
        System.out.println("--- Input ---");
        System.out.println(n);
        System.out.println("--- Output ---");
        System.out.println(isArmstrong(n));
        System.out.println("\n*** END TEST CASE ***\n");

        n = 123;
        System.out.println("--- Input ---");
        System.out.println(n);
        System.out.println("--- Output ---");
        System.out.println(isArmstrong(n));
        System.out.println("\n*** END TEST CASE ***\n");
    }

    private boolean isArmstrong(int n) {
        int k = (int) (Math.log10(n) + 1);
        int buffer = n;
        int result = 0;
        while(n != 0) {
            int x = n % 10;
            result += Math.pow(x, k);
            n = n / 10;
        }
        return result == buffer;
    }
}
