package com.arraysOnTOp.prateekJainQuestion;

public class Maxelement {
    static void maxFInd(int[] arr){
        int max  = Integer.MIN_VALUE;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i] > max ){
                max = arr[i];
            }
        }
        System.out.println(max);
    }


    static void main() {
        int [] arr = {1,2,4,5,10,9,20,3,55,11};
        maxFInd(arr);

    }
}
