package io.abhijith.utils;

public class PrintUtils {

    public static void printMatrix(int[][] matrix) {
        int m = matrix[0].length;
        for (int[] ints : matrix) {
            for (int j = 0; j < m; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }

    public static<T> void printArray(T[] data) {
        System.out.print("{ ");
        for (T item: data) {
            System.out.print(item + " ");
        }
        System.out.print("}\n");
    }

}
