package io.abhijith.utils;

import org.junit.Test;

public class BasicUtils {

    @Test
    public void convertMatrixString() {
        String input = "[[0,1,2,0],[3,4,5,2],[1,3,1,5]]";
        String output = input.replaceAll("\\[", "{");
        output = output.replaceAll("]", "}");
        System.out.println(output);
    }
}
