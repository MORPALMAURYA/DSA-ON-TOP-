package com.pattrenOnTop.AlllPracticesQuestions.LaksheyDoubt;

import java.util.Scanner;

public class invertedMixhalfPyramid {

    static void mixHalfPyramid(int n){
        for (int i = 0; i <n ; i++) {

            // star
            for (int j = 0; j <i+1 ; j++) IO.print("* ");

            //space
            for (int j = 0; j <2 * (n - i) - 1; j++) IO.print("  ");

            //star
            for (int j = 0; j <i+1 ; j++) IO.print("* ");

            System.out.println();
        }
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number n");
        int n = sc.nextInt();
        mixHalfPyramid(n);
    }
}
