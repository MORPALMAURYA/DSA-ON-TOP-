package com.pattrenOnTop.AlllPracticesQuestions.praBefore;

import java.util.Scanner;

public class InvertedHalfPramid {

    static void invertedHalfPramid(int n){
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <n-i ; j++) {
                IO.print("* ");
            }
            System.out.println();

        }

    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of integers:");
        int n = sc.nextInt();
        invertedHalfPramid(n);
    }
}
