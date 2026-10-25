package com.recursionOnTop.RecursionQu.array;

public class PrintArray {

    public static void arrayPrint(int[] arr , int index){
        if(index == arr.length){
            return;
        }
        System.out.print(arr[index]+",");
        arrayPrint(arr, index+1);

    }

    static void main() {
        int [] arr= {1,23,4,5,5,7,8,9,90};
        int index=0;
        arrayPrint(arr,index);



    }
}
