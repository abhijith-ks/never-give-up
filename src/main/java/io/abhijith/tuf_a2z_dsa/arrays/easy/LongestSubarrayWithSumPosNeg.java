package io.abhijith.tuf_a2z_dsa.arrays.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * https://takeuforward.org/arrays/longest-subarray-with-sum-k-postives-and-negatives/
 */
public class LongestSubarrayWithSumPosNeg {

    private int getLongestSubarray(Integer[] input, int k) {
        int result = 0;
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < input.length; i++) {
            sum += input[i];

        }
        return result;
    }
}
