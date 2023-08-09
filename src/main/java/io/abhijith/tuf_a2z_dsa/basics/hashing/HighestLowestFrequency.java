package io.abhijith.tuf_a2z_dsa.basics.hashing;

import io.abhijith.utils.PrintUtils;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * https://takeuforward.org/arrays/find-the-highest-lowest-frequency-element/
 */
public class HighestLowestFrequency {

    @Test
    public void test() {
        Integer[] input = {10,5,10,15,10,5};
        System.out.println("--- Input ---");
        PrintUtils.printArray(input);
        System.out.println("--- Output ---");
        findLowestAndHighestFrequency(input);
        System.out.println("\n*** END TEST CASE ***\n");

        input = new Integer[]{2,2,3,4,4,2};
        System.out.println("--- Input ---");
        PrintUtils.printArray(input);
        System.out.println("--- Output ---");
        findLowestAndHighestFrequency(input);
        System.out.println("\n*** END TEST CASE ***\n");
    }

    private void findLowestAndHighestFrequency(Integer[] input) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int item: input) {
            map.put(item, map.getOrDefault(item, 0) + 1);
        }
        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;
        int minItem = 0;
        int maxItem = 0;
        for(Map.Entry<Integer, Integer> item: map.entrySet()) {
            if(item.getValue() < minValue) {
                minValue = item.getValue();
                minItem = item.getKey();
            }
            if(item.getValue() > maxValue) {
                maxValue = item.getValue();
                maxItem = item.getKey();
            }
        }
        System.out.println("Lowest Freq : " + minItem);
        System.out.println("Highest Freq: " + maxItem);
    }
}
