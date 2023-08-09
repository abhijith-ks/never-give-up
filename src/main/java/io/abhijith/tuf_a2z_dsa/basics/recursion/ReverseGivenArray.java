package io.abhijith.tuf_a2z_dsa.basics.recursion;

import io.abhijith.utils.PrintUtils;
import org.junit.Test;

public class ReverseGivenArray {

    @Test
    public void test() {
        Integer[] a = {5, 4, 3, 2, 1};
        System.out.println("--- Input ---");
        PrintUtils.printArray(a);
        System.out.println("--- Output ---");
        Integer[] b = new Integer[a.length];
        reverse(0, a, b);
        PrintUtils.printArray(b);
        System.out.println("\n*** END TEST CASE ***\n");

        System.out.println("--- Input ---");
        PrintUtils.printArray(a);
        System.out.println("--- Output ---");
        reverseInPlace(0, a);
        PrintUtils.printArray(a);
        System.out.println("\n*** END TEST CASE ***\n");
    }

    private void reverse(int i, Integer[] a, Integer[] b) {
        if (i == a.length) {
            return;
        }
        b[b.length - i - 1] = a[i];
        reverse(i + 1, a, b);
    }

    private void reverseInPlace(int i, Integer[] a) {
        if (i >= a.length / 2) {
            return;
        }
        int swap = a[a.length - i - 1];
        a[a.length - i - 1] = a[i];
        a[i] = swap;
        reverseInPlace(i + 1, a);
    }
}
