package io.abhijith.tuf_a2z_dsa.arrays.easy;

import io.abhijith.utils.PrintUtils;
import org.junit.Test;

/**
 * https://takeuforward.org/data-structure/check-if-an-array-is-sorted/
 */
public class CheckIfArrayIsSorted {

    @Test
    public void test() {
        Integer[] input = {1,2,3,4,5};
        System.out.println("--- Input ---");
        PrintUtils.printArray(input);
        System.out.println("--- Output ---");
        System.out.println(isSorted(input));
        System.out.println("\n*** END TEST CASE ***\n");

        input = new Integer[]{5,4,6,7,8};
        System.out.println("--- Input ---");
        PrintUtils.printArray(input);
        System.out.println("--- Output ---");
        System.out.println(isSorted(input));
        System.out.println("\n*** END TEST CASE ***\n");
    }

    private boolean isSorted(Integer[] input) {
        for(int i = 1; i < input.length; i++) {
            if(input[i] < input[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
