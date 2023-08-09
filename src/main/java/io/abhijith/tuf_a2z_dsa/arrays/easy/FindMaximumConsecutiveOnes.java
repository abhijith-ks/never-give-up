package io.abhijith.tuf_a2z_dsa.arrays.easy;

import io.abhijith.utils.PrintUtils;
import org.junit.Test;

/**
 * https://takeuforward.org/data-structure/count-maximum-consecutive-ones-in-the-array/
 */
public class FindMaximumConsecutiveOnes {

    @Test
    public void test() {
        Integer[] input = new Integer[]{1, 1, 0, 1, 1, 1};
        System.out.println("--- Input ---");
        PrintUtils.printArray(input);
        System.out.println("--- Output ---");
        System.out.println(maximumConsecutiveOnes(input));
        System.out.println("\n*** END TEST CASE ***\n");

        input = new Integer[]{1, 0, 1, 1, 0, 1};
        System.out.println("--- Input ---");
        PrintUtils.printArray(input);
        System.out.println("--- Output ---");
        System.out.println(maximumConsecutiveOnes(input));
        System.out.println("\n*** END TEST CASE ***\n");
    }

    private int maximumConsecutiveOnes(Integer[] input) {
        int i = 0;
        int result = 0;
        while(i < input.length) {
            while(i < input.length && input[i] != 1) {
                i++;
            }
            int currentCount = 0;
            while(i < input.length && input[i] == 1) {
                currentCount += 1;
                i++;
            }
            result = Math.max(result, currentCount);
        }
        return result;
    }
}
