package com.pattrenOnTop.AlllPracticesQuestions.LaksheyDoubt;

import java.util.Scanner;

public class InvertedFullPyramid {

    static void invertedFullPyramid(int n){
        for (int i = 0; i <n ; i++) {

            // space
            for (int j = 0; j < i ; j++) IO.print(" ");

            //Star
            for (int j = 0; j < n-i-1 ; j++) IO.print("* ");


            System.out.println();
        }
    }

    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number");
        int n = input.nextInt();
        invertedFullPyramid(n);
    }
}
