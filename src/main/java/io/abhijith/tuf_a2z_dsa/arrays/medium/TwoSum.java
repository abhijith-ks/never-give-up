package io.abhijith.tuf_a2z_dsa.arrays.medium;

import io.abhijith.utils.PrintUtils;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * https://takeuforward.org/data-structure/two-sum-check-if-a-pair-with-given-sum-exists-in-array/
 */
public class TwoSum {

    @Test
    public void test() {
        Integer[] input = new Integer[]{2,6,5,8,11};
        int target = 14;
        System.out.println("--- Input ---");
        PrintUtils.printArray(input);
        System.out.println("Target : " + target);
        System.out.println("--- Output ---");
        System.out.println(isPresent(input, target));
        System.out.println("\n*** END TEST CASE ***\n");

        input = new Integer[]{2,6,5,8,11};
        target = 15;
        System.out.println("--- Input ---");
        PrintUtils.printArray(input);
        System.out.println("Target : " + target);
        System.out.println("--- Output ---");
        System.out.println(isPresent(input, target));
        System.out.println("\n*** END TEST CASE ***\n");
    }

    private boolean isPresent(Integer[] input, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < input.length; i++) {
            map.put(input[i], i);
        }

        for(int i = 0; i < input.length; i++) {
            if(map.containsKey(target - input[i]) && i != map.get(target - input[i])) {
                return true;
            }
        }
        return false;
    }
}
