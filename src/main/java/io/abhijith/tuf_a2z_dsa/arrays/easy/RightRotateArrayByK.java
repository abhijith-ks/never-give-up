package io.abhijith.tuf_a2z_dsa.arrays.easy;

import io.abhijith.utils.PrintUtils;
import org.junit.Test;

/**
 * https://takeuforward.org/data-structure/rotate-array-by-k-elements/
 */
public class RightRotateArrayByK {

    @Test
    public void test() {
        Integer[] input = new Integer[]{1,2,3,4,5,6,7};
        System.out.println("--- Input ---");
        PrintUtils.printArray(input);
        System.out.println("--- Output ---");
        rightRotateByK(input, 2);
        PrintUtils.printArray(input);
        System.out.println("\n*** END TEST CASE ***\n");
    }

    private void rightRotateByK(Integer[] input, int k) {
        int n = input.length;
        reverse(input, n - k, n - 1);
        reverse(input, 0, n - k - 1);
        reverse(input, 0, n - 1);
    }

    private void reverse(Integer[] input, int start, int end) {
        while(start < end) {
            int temp = input[start];
            input[start] = input[end];
            input[end] = temp;
            start += 1;
            end -= 1;
        }
    }
}
