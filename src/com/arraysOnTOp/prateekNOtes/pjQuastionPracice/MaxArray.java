package com.arraysOnTOp.prateekNOtes.pjQuastionPracice;

public class MaxArray {

   static void maxFind(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Max element is "+max);
    }

    static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        maxFind(arr);

    }
}
