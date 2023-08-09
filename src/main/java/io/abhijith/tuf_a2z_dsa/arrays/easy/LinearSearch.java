package io.abhijith.tuf_a2z_dsa.arrays.easy;

import io.abhijith.utils.PrintUtils;
import org.junit.Test;

/**
 * https://takeuforward.org/data-structure/linear-search-in-c/
 */
public class LinearSearch {

    @Test
    public void test() {
        Integer[] input = new Integer[]{1, 2, 3, 4, 5};
        System.out.println("--- Input ---");
        PrintUtils.printArray(input);
        System.out.println("--- Output ---");
        System.out.println(findIndex(input, 3));
        System.out.println("\n*** END TEST CASE ***\n");

        input = new Integer[]{1, 2, 3, 4, 5};
        System.out.println("--- Input ---");
        PrintUtils.printArray(input);
        System.out.println("--- Output ---");
        System.out.println(findIndex(input, 7));
        System.out.println("\n*** END TEST CASE ***\n");
    }

    private int findIndex(Integer[] input, int k) {
        int index = -1;
        for(int i = 0; i < input.length; i++) {
            if(input[i] == k) {
                index = i;
            }
        }
        return index;
    }
}
