package io.abhijith.tuf_a2z_dsa.arrays.easy;

import io.abhijith.utils.PrintUtils;
import org.junit.Test;

/**
 * https://takeuforward.org/data-structure/remove-duplicates-in-place-from-sorted-array/
 */
public class RemoveDuplicatesFromSortedArray {

    @Test
    public void test() {
        Integer[] input = new Integer[]{1,1,2,2,2,3,3};
        System.out.println("--- Input ---");
        PrintUtils.printArray(input);
        System.out.println("--- Output ---");
        removeDuplicates(input);
        PrintUtils.printArray(input);
        System.out.println("\n*** END TEST CASE ***\n");
    }

    private void removeDuplicates(Integer[] input) {
        int i = 0;
        int j = 0;
        while(j < input.length) {
            if(input[i] != input[j]) {
                i++;
                input[i] = input[j];
            }
            j++;
        }
    }
}
