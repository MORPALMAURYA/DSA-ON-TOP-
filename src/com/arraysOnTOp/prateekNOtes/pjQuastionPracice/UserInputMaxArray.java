package com.arraysOnTOp.prateekNOtes.pjQuastionPracice;

import java.util.Scanner;

public class UserInputMaxArray {

    int  maxElement(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }

        }
        return max;
    }

    static void main(String[] args) {
        UserInputMaxArray obj = new UserInputMaxArray();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        int [] arr = new int [n];
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i <arr.length ; i++) {
            arr[i] = sc.nextInt();
        }
       int ans =  obj.maxElement(arr);
        System.out.println("Max element is "+ans);

    }
}
