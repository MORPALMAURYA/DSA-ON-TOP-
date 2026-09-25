package com.arraysOnTOp.prateekJainQuestion;

public class SparkMatrix {

    static void sparkMatrix(int [][]arr){
        int zero = 0;
        int nonzero = 0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr.length ; j++) {
                if(arr[i][j]==0){
                    zero++;
                }
                else {
                    nonzero++;
                }

            }

        }
        if(zero>nonzero){
            System.out.println("Spark Matrix");
        }
        else {
            System.out.println("Dense");
        }
    }

    static void main() {
        int [] [] arr= {
            {12,3,4,5},
            {0,0,0,0},
                {0,1,0,0},
        };
        sparkMatrix(arr);
    }

}
