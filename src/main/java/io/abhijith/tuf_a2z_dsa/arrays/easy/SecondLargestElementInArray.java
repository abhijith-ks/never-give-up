package io.abhijith.tuf_a2z_dsa.arrays.easy;

import io.abhijith.utils.PrintUtils;
import org.junit.Test;

/**
 * https://takeuforward.org/data-structure/find-second-smallest-and-second-largest-element-in-an-array/
 */
public class SecondLargestElementInArray {

    @Test
    public void test() {
        Integer[] input =  {2,5,1,3,0};
        System.out.println("--- Input ---");
        PrintUtils.printArray(input);
        System.out.println("--- Output ---");
        System.out.println(findSecondLargest(input));
        System.out.println("\n*** END TEST CASE ***\n");

        input = new Integer[]{1,2,4,7,7,5};
        System.out.println("--- Input ---");
        PrintUtils.printArray(input);
        System.out.println("--- Output ---");
        System.out.println(findSecondLargest(input));
        System.out.println("\n*** END TEST CASE ***\n");

    }

    private int findSecondLargest(Integer[] input) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (Integer item: input) {
            largest = Math.max(largest, item);
            if(item != largest) {
                secondLargest = Math.max(secondLargest, item);
            }
        }
        return secondLargest;
    }
}
