package com.arraysOnTOp.prateekJainQuestion;

public class LowerTrigularMatrix {
    static void lowerTrigularMatrix(int [][] arr){
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                if(i>-j){
                    System.out.print(+arr[i][j]+",");
                }
            }
            System.out.println();

        }
    }

    static void main(String[] args) {
        int [][] arr={{1,2,3},
                      {5,6,7},
                      {9,10,11}
                  };
        lowerTrigularMatrix(arr);
    }
}
