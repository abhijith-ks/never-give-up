package io.abhijith.tuf_a2z_dsa.basics.maths;

import org.junit.Test;

/**
 * References
 * https://takeuforward.org/c-programs/reverse-a-number-in-c/
 * https://leetcode.com/submissions/detail/1009024108/
 */
public class ReverseInteger {

    @Test
    public void test() {
        int x = 1234;
        System.out.println("--- Input ---");
        System.out.println(x);
        System.out.println("--- Output ---");
        System.out.println(reverse(x));
        System.out.println("\n*** END TEST CASE ***\n");
    }

    private int reverse(int x) {
        long curr = 0;
        while(x != 0) {
            int a = x % 10;
            curr = curr * 10 + a;
            x /= 10;
        }
        if(curr > Integer.MAX_VALUE || curr < Integer.MIN_VALUE) return 0;
        return (int)curr;
    }
}
