package io.abhijith.tuf_a2z_dsa.arrays.easy;

import io.abhijith.utils.PrintUtils;
import org.junit.Test;

/**
 * https://takeuforward.org/data-structure/left-rotate-the-array-by-one/
 */
public class LeftRotateArrayByOne {

    @Test
    public void test() {
        Integer[] input = new Integer[]{1,2,3,4,5};
        System.out.println("--- Input ---");
        PrintUtils.printArray(input);
        System.out.println("--- Output ---");
        leftRotateByOne(input);
        PrintUtils.printArray(input);
        System.out.println("\n*** END TEST CASE ***\n");
    }

    private void leftRotateByOne(Integer[] input) {
        int x = input[0];
        for(int i = 1; i < input.length; i++) {
            input[i - 1] = input[i];
        }
        input[input.length - 1] = x;
    }
}
