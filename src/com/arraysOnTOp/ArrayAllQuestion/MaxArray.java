package com.arraysOnTOp.ArrayAllQuestion;

import java.util.Scanner;

public class MaxArray {
    static void main() {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int [] arr = new int [n];

        int [] arr = {4,2,44,22,45,31,97};

        int max= Integer.MIN_VALUE;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i] > max)
                max = arr[i];

        }

        System.out.println("Max number is :"+max);
    }
}
