package io.abhijith.tuf_a2z_dsa.arrays.easy;

import io.abhijith.utils.PrintUtils;
import org.junit.Test;

/**
 * https://takeuforward.org/data-structure/longest-subarray-with-given-sum-k/
 */
public class LongestSubarrayWithSum {

    @Test
    public void test() {
        Integer[] input = new Integer[]{2,3,5};
        int k = 5;
        System.out.println("--- Input ---");
        PrintUtils.printArray(input);
        System.out.println("K : " + k);
        System.out.println("--- Output ---");
        System.out.println(getLongestSubArray(input, k));
        System.out.println("\n*** END TEST CASE ***\n");

        input = new Integer[]{2,3,5,1,9};
        k = 10;
        System.out.println("--- Input ---");
        PrintUtils.printArray(input);
        System.out.println("K : " + k);
        System.out.println("--- Output ---");
        System.out.println(getLongestSubArray(input, k));
        System.out.println("\n*** END TEST CASE ***\n");
    }

    private int getLongestSubArray(Integer[] input, int k) {
        Integer result = 0;
        int i = 0, j = 0, sum = 0;
        while(j < input.length) {
            if(sum + input[j] == k) {
                result = Math.max(result, j - i + 1);
                i++;
                j++;
            } else if(sum + input[j] <= k) {
                sum += input[j];
                j++;
            } else {
                sum -= input[i];
                i++;
            }
        }
        return result;
    }
}
