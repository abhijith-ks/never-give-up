package io.abhijith.tuf_a2z_dsa.basics.recursion;

import org.junit.Test;

/**
 * https://takeuforward.org/data-structure/check-if-the-given-string-is-palindrome-or-not/
 */
public class CheckPalindrome {

    @Test
    public void test() {
        String input = "ABCDCBA";
        System.out.println("--- Input ---");
        System.out.println(input);
        System.out.println("--- Output ---");
        System.out.println(isPalindrome(input, 0, input.length() - 1));
        System.out.println("\n*** END TEST CASE ***\n");

        input = "TAKE U FORWARD";
        System.out.println("--- Input ---");
        System.out.println(input);
        System.out.println("--- Output ---");
        System.out.println(isPalindrome(input, 0, input.length() - 1));
        System.out.println("\n*** END TEST CASE ***\n");
    }

    private boolean isPalindrome(String input, int i, int j) {
        if(i > j) {
            return true;
        }
        if(input.charAt(i) != input.charAt(j)) {
            return false;
        }
        return isPalindrome(input, i + 1, j - 1);
    }
}
