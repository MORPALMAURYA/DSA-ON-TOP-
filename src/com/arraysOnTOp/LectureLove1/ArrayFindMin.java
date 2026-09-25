package com.arraysOnTOp.LectureLove1;

public class ArrayFindMin {

    static void findMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]< min){
                min = arr[i];
            }
        }
        System.out.println("Minimum number is "+min);

    }

    static void main() {
        int [] arr = {12,34,32,98,22};
        findMin(arr);
    }
}
