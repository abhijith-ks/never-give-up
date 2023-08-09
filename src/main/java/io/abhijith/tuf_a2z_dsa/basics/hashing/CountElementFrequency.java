package io.abhijith.tuf_a2z_dsa.basics.hashing;

import io.abhijith.utils.PrintUtils;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * https://takeuforward.org/data-structure/count-frequency-of-each-element-in-the-array/
 */
public class CountElementFrequency {

    @Test
    public void test() {
        Integer[] input = {10,5,10,15,10,5};
        System.out.println("--- Input ---");
        PrintUtils.printArray(input);
        System.out.println("--- Output ---");
        Map<Integer, Integer> result = countElements(input);
        System.out.println(result);
        System.out.println("\n*** END TEST CASE ***\n");
    }

    private Map<Integer, Integer> countElements(Integer[] elements) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int item: elements) {
            map.put(item, map.getOrDefault(item, 0) + 1);
        }
        return map;
    }
}