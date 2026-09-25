package com.arraysOnTOp.LectureLove1;

public class ArrayPrintingZeroOnes {
    static  void printZeroOnes(int[] arr) {
        int countZero = 0;
        int countOne = 0;

        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] == 0) {
                countOne++;
            }
            if (arr[i] == 1) {
                countZero++;
            }
        }
        System.out.println(countZero);
        System.out.println(countOne);
    }

    public static void main(String[] args) {
        int[] arr = {0,1,1,1,1,1,1,0,1,0,1,0,1};
        printZeroOnes(arr);
    }
}
