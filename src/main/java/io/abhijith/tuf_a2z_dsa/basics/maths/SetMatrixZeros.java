package io.abhijith.tuf_a2z_dsa.basics.maths;

import io.abhijith.utils.PrintUtils;
import org.junit.Test;

/**
 * References
 * https://leetcode.com/problems/set-matrix-zeroes/submissions/1008418938/
 * https://takeuforward.org/data-structure/set-matrix-zero/
 */
public class SetMatrixZeros {

    @Test
    public void test() {
        int[][] matrix = new int[][]{{1,1,1},{1,0,1},{1,1,1}};
        System.out.println("--- Input ---");
        PrintUtils.printMatrix(matrix);
        setZeroes(matrix);
        System.out.println("--- Output ---");
        PrintUtils.printMatrix(matrix);
        System.out.println("\n*** END TEST CASE ***\n");

        matrix = new int[][]{{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        System.out.println("--- Input ---");
        PrintUtils.printMatrix(matrix);
        setZeroes(matrix);
        System.out.println("--- Output ---");
        PrintUtils.printMatrix(matrix);
        System.out.println("\n*** END TEST CASE ***\n");
    }

    private void setZeroes(int[][] matrix) {
        int col1 = 1;
        int n = matrix.length;
        int m = matrix[0].length;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    if(j == 0) {
                        col1 = 0;
                    } else {
                        matrix[0][j] = 0;
                    }
                }
            }
        }

        for(int i = 1; i < n; i++) {
            for(int j = 1; j < m; j++) {
                if(matrix[i][j] != 0) {
                    if(matrix[i][0] == 0 || matrix[0][j] == 0) {
                        matrix[i][j] = 0;
                    }
                }
            }
        }

        if(matrix[0][0] == 0) {
            for(int i = 0; i < m; i++) {
                matrix[0][i] = 0;
            }
        }

        if(col1 == 0) {
            for(int i = 0; i < n; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}
