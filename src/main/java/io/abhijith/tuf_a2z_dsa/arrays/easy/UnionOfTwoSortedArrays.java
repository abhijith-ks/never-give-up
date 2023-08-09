package io.abhijith.tuf_a2z_dsa.arrays.easy;

import io.abhijith.utils.PrintUtils;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * https://takeuforward.org/data-structure/union-of-two-sorted-arrays/
 */
public class UnionOfTwoSortedArrays {

    @Test
    public void test() {
        Integer[] input1 = new Integer[]{1,2,3,4,5};
        Integer[] input2 = new Integer[]{2,3,4,4,5};
        System.out.println("--- Input ---");
        PrintUtils.printArray(input1);
        PrintUtils.printArray(input2);
        System.out.println("--- Output ---");
        PrintUtils.printArray(union(input1, input2));
        System.out.println("\n*** END TEST CASE ***\n");

        input1 = new Integer[]{1,2,3,4,5,6,7,8,9,10};
        input2 = new Integer[]{2,3,4,4,5,11,12};
        System.out.println("--- Input ---");
        PrintUtils.printArray(input1);
        PrintUtils.printArray(input2);
        System.out.println("--- Output ---");
        PrintUtils.printArray(union(input1, input2));
        System.out.println("\n*** END TEST CASE ***\n");
    }

    private Integer[] union(Integer[] input1, Integer[] input2) {
        List<Integer> result = new ArrayList<>();
        int i = 0;
        int j = 0;
        while(i < input1.length && j < input2.length) {
            if(input1[i] == input2[j]) {
                result.add(input1[i]);
                i++;
                j++;
            } else if(input1[i] < input2[j]) {
                if(result.isEmpty()) {
                    result.add(input1[i]);
                } else if(result.get(result.size() - 1) != input1[i]) {
                    result.add(input1[i]);
                }
                i++;
            } else {
                if(result.isEmpty()) {
                    result.add(input1[j]);
                } else if(result.get(result.size() - 1) != input2[j]) {
                    result.add(input2[j]);
                }
                j++;
            }
        }
        while(i < input1.length) {
            if(result.isEmpty()) {
                result.add(input1[i]);
            } else if(result.get(result.size() - 1) != input1[i]) {
                result.add(input1[i]);
            }
            i++;
        }
        while(j < input2.length) {
            if(result.isEmpty()) {
                result.add(input1[j]);
            } else if(result.get(result.size() - 1) != input2[j]) {
                result.add(input2[j]);
            }
            j++;
        }
        return result.toArray(Integer[]::new);
    }
}
