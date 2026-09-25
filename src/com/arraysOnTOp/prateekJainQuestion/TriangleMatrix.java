package com.arraysOnTOp.prateekJainQuestion;

public class TriangleMatrix {
    static void checkMatrix(int[][] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(i < j){
                    System.out.print(arr[i][j]+",");
                }
                else {
                    System.out.print("0"+",");
                }
            }
            System.out.println();
        }
    }

    static void main() {
        int [][] arr = {{11,32,33},
                {45,6,7},
                {55,21,11}
        };

        checkMatrix(arr);
    }
}
