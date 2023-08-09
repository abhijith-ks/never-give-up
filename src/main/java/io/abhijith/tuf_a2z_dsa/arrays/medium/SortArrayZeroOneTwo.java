package io.abhijith.tuf_a2z_dsa.arrays.medium;

import io.abhijith.utils.PrintUtils;
import org.junit.Test;

/**
 * https://takeuforward.org/data-structure/sort-an-array-of-0s-1s-and-2s/
 */
public class SortArrayZeroOneTwo {

    @Test
    public void test() {
        Integer[] input = new Integer[]{2,0,2,1,1,0};
        System.out.println("--- Input ---");
        PrintUtils.printArray(input);
        System.out.println("--- Output ---");
        dutchNationalFlagAlgorithm(input);
        PrintUtils.printArray(input);
        System.out.println("\n*** END TEST CASE ***\n");

        input = new Integer[]{1,2,0};
        System.out.println("--- Input ---");
        PrintUtils.printArray(input);
        System.out.println("--- Output ---");
        dutchNationalFlagAlgorithm(input);
        PrintUtils.printArray(input);
        System.out.println("\n*** END TEST CASE ***\n");
    }

    private void dutchNationalFlagAlgorithm(Integer[] input) {
        int low = 0;
        int mid = 0;
        int high = input.length - 1;
        while(mid <= high) {
            if(input[mid] == 0) {
                int temp = input[low];
                input[low] = input[mid];
                input[mid] = temp;
                mid += 1;
                low += 1;
            } else if(input[mid] == 2) {
                int temp = input[mid];
                input[mid] = input[high];
                input[high] = temp;
                high -= 1;
            } else {
                mid += 1;
            }
        }
    }
}
