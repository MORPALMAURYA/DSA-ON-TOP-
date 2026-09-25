package com.arraysOnTOp.prateekJainQuestion;

public class SparkAndDense {

    static void SparkMatrix(int [][] arr) {



//        int zero = 0;
//        int nonZero = 0;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length; j++) {
//                if (arr[i][j] == 0) {
//                    zero++;
//                } else {
//                    nonZero++;
//                }
//            }
//        }
//        if (zero > nonZero) {
//            System.out.println("Spark Matrix");
//        } else {
//            System.out.println("Dense Matrix");
//        }



        int n=1,m=1;
        int total = m * n;
        int zero = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 0) {
                    zero++;
                }
            }
        }

        if (zero > total / 2) {
            System.out.println("Sparse Matrix");
        } else {
            System.out.println("Dense Matrix");
        }

    }


    static void printHalf(int[][] matrix) {

        int m = matrix.length;
        int n = matrix[0].length;

        int half = (m * n) / 2;
        int count = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (count < half) {
                    System.out.print(matrix[i][j] + " ");
                    count++;
                }
            }
        }}

    static void checkMatrix(int[][] matrix) {

        int zero = 0;
        int total = matrix.length * matrix[0].length;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {

                if (matrix[i][j] == 0) {
                    zero++;
                }
            }
        }

        if (zero > total / 2) {
            System.out.println("Sparse Matrix");
        } else {
            System.out.println("Dense Matrix");
        }
    }

    static void main() {
        int [][] arr = {
                {10,2,3},
                {0,2,4},
                {0,0,5}
                   };
            checkMatrix(arr);
    }
}
