package com.arraysOnTOp.prateekNOtes.pjQuastionPracice;

public class Swaping {
    static void swap(int [] arr ){
        int i = 0;
        int j = arr.length - 1;
        while (i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }


    }
    static void main() {
        int [] arr = {1,2,3,4};
        swap(arr);

        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }


    }
}
