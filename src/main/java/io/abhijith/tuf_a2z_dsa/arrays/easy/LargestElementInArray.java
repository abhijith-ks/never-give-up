package io.abhijith.tuf_a2z_dsa.arrays.easy;

import io.abhijith.utils.PrintUtils;
import org.junit.Test;

/**
 * https://takeuforward.org/data-structure/find-the-largest-element-in-an-array/
 */
public class LargestElementInArray {

    @Test
    public void test() {
        Integer[] input =  {2,5,1,3,0};
        System.out.println("--- Input ---");
        PrintUtils.printArray(input);
        System.out.println("--- Output ---");
        System.out.println(findLargest(input));
        System.out.println("\n*** END TEST CASE ***\n");

        System.out.println("--- Input ---");
        PrintUtils.printArray(input);
        System.out.println("--- Output ---");
        findRecursively(input, 0);
        System.out.println(max);
        System.out.println("\n*** END TEST CASE ***\n");
    }

    private int findLargest(Integer[] input) {
        int max = Integer.MIN_VALUE;
        for(Integer item: input) {
            max = Math.max(max, item);
        }
        return max;
    }

    int max = Integer.MIN_VALUE;
    private void findRecursively(Integer[] input, int index) {
        if(index >= input.length) {
            return;
        }
        max = Math.max(max, input[index]);
        findRecursively(input, index + 1);
    }
}
