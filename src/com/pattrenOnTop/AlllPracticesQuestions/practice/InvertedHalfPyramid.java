package com.pattrenOnTop.AlllPracticesQuestions.practice;

public class InvertedHalfPyramid {

    public static void invertedHalfPyramid(int n) {
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n-i ; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }

    static void main() {
        int n = 8;
        invertedHalfPyramid(n);
    }
}
