package io.abhijith.tuf_a2z_dsa.arrays.easy;

import io.abhijith.utils.PrintUtils;
import org.junit.Test;

/**
 * https://takeuforward.org/arrays/find-the-missing-number-in-an-array/
 */
public class FindMissingNumberInArray {

    @Test
    public void test() {
        Integer[] input = new Integer[]{1,2,4,5};
        System.out.println("--- Input ---");
        PrintUtils.printArray(input);
        System.out.println("--- Output ---");
        System.out.println(findMissing(input));
        System.out.println("\n*** END TEST CASE ***\n");
    }

    private int findMissing(Integer[] input) {
        int length = input.length + 1;
        int expectedSum = (length * (length + 1)) / 2;
        int actualSum = 0;
        for(Integer item: input) {
            actualSum += item;
        }
        return expectedSum - actualSum;
    }
}
