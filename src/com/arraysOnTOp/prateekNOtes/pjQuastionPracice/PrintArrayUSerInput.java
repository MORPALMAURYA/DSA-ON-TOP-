package com.arraysOnTOp.prateekNOtes.pjQuastionPracice;

import java.util.Scanner;

public class PrintArrayUSerInput {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter Array length");
        int length = sc.nextInt();

        System.out.println("enter Array elements");
        int [] arr = new int[length];

        for (int i = 0; i < arr.length ; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + ",");

        }
    }
}
