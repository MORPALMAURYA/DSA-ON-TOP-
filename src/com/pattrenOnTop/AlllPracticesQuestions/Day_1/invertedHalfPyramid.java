package com.pattrenOnTop.AlllPracticesQuestions.Day_1;

public class invertedHalfPyramid {
    static void invertedHalfPyramid(int n){
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n-i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void main() {
        int n = 5;
        invertedHalfPyramid(n);

    }
}
