package io.abhijith.tuf_a2z_dsa.arrays.easy;

import io.abhijith.utils.PrintUtils;
import org.junit.Test;

/**
 * https://takeuforward.org/data-structure/move-all-zeros-to-the-end-of-the-array/
 */
public class MoveZerosToEnd {

    @Test
    public void test() {
        Integer[] input = new Integer[]{1 ,0 ,2 ,3 ,0 ,4 ,0 ,1};
        System.out.println("--- Input ---");
        PrintUtils.printArray(input);
        System.out.println("--- Output ---");
        moveZeros(input);
        PrintUtils.printArray(input);
        System.out.println("\n*** END TEST CASE ***\n");

        input = new Integer[]{1,2,0,1,0,4,0};
        System.out.println("--- Input ---");
        PrintUtils.printArray(input);
        System.out.println("--- Output ---");
        moveZeros(input);
        PrintUtils.printArray(input);
        System.out.println("\n*** END TEST CASE ***\n");
    }

    private void moveZeros(Integer[] input) {
        int i = 0;
        int j = 0;
        while(j < input.length) {
            if(input[j] != 0) {
                input[i] = input[j];
                i++;
            }
            j++;
        }
        while(i < input.length) {
            input[i++] = 0;
        }
    }
}
