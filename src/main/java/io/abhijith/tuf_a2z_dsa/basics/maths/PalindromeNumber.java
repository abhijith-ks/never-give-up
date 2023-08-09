package io.abhijith.tuf_a2z_dsa.basics.maths;

import org.junit.Test;

public class PalindromeNumber {

    @Test
    public void test() {
        int x = 121;
        System.out.println("--- Input ---");
        System.out.println(x);
        System.out.println("--- Output ---");
        System.out.println(isPalindrome(x));
        System.out.println("\n*** END TEST CASE ***\n");

        x = -121;
        System.out.println("--- Input ---");
        System.out.println(x);
        System.out.println("--- Output ---");
        System.out.println(isPalindrome(x));
        System.out.println("\n*** END TEST CASE ***\n");
    }


    private boolean isPalindrome(int x) {
        int a = 0;
        int y = x;
        while(x != 0) {
            a = (a * 10) + (x % 10);
            x = x / 10;
        }
        return y == a && y >= 0;
    }
}
