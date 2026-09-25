package com.arraysOnTOp.prateekJainQuestion;

public class SecondLargetsNumberArray {

    static void secondLargest(int[] arr){
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0 ; i < arr.length ; i++) {
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            }
           else if(arr[i] > secondLargest){
                secondLargest = arr[i];
            }
        }
        System.out.print(secondLargest+"\t");
    }

    static void main(String[] args) {
        int []arr = {1,2,3,4,5};
        secondLargest(arr);
    }
}
