package com.arraysOnTOp.prateekJainQuestion;

public class ReverseArray {

    static void reverseArray(int[] arr) {
        for (int i = arr.length-1; i > 0 ; i--) {
            System.out.print(arr[i]+",");
        }
    }
    static void main() {
        int [] arr = {1,2,4,5,10,9,20,3,55,11};
        reverseArray(arr);
    }
}
