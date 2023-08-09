package io.abhijith.tuf_a2z_dsa.arrays.easy;

import io.abhijith.utils.PrintUtils;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * https://takeuforward.org/arrays/find-the-number-that-appears-once-and-the-other-numbers-twice/
 */
public class NumberAppearingOnce {

    @Test
    public void test() {
        Integer[] input = new Integer[]{2,2,1};
        System.out.println("--- Input ---");
        PrintUtils.printArray(input);
        System.out.println("--- Output ---");
        System.out.println(findNumberAppearingOnce(input));
        System.out.println("\n*** END TEST CASE ***\n");

        input = new Integer[]{4,1,2,1,2};
        System.out.println("--- Input ---");
        PrintUtils.printArray(input);
        System.out.println("--- Output ---");
        System.out.println(xorMethod(input));
        System.out.println("\n*** END TEST CASE ***\n");
    }

    private Integer xorMethod(Integer[] input) {
        Integer result = 0;
        for(Integer item: input) {
            result = result ^ item;
        }
        return result;
    }

    private Integer findNumberAppearingOnce(Integer[] input) {
        Set<Integer> set = new HashSet<>();
        for(Integer item: input) {
            if(set.contains(item)) {
                set.remove(item);
            } else {
                set.add(item);
            }
        }
        return (Integer) set.toArray()[0];
    }
}
