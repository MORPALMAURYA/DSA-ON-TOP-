package com.arraysOnTOp.prateekJainQuestion;

public class AntiDiagonalmatrix {
    static void antiDiagonal(int [][]arr){
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr.length; j++) {
                //j == n-1-i
                if(j+i == arr.length-1) {
                    System.out.print(arr[i][j]+"\t");
                }
            }
            System.out.println();

        }
    }

    static void main(String[] args) {
        int [][] arr={{1,2,3},
                {5,6,7},
                {9,10,11}};
        antiDiagonal(arr);
    }
}
