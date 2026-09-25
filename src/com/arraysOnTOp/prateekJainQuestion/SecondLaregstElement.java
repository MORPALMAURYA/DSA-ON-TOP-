package com.arraysOnTOp.prateekJainQuestion;

public class SecondLaregstElement {

    static void SecondLargest(int[] arr){
        int max1 =Integer.MIN_VALUE;
        int max2 =Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > max1){
                max2 = max1;
                max1 = arr[i];
            }
            else if(arr[i] > max2){
                max2 = arr[i];
           }
        }
        System.out.println("Second Largest Element is: "+max2);
    }

    static void main() {
        int [] arr = {1,2,4,5,10,9,20,3,55,11};
        SecondLargest(arr);
    }
}
