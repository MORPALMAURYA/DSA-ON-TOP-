package com.pattrenOnTop.AlllPracticesQuestions.practice;

public class HollowInvertedHalfPyramid {
    static void invertedHalfPyramid(int n) {
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n-i ; j++) {
                if(i+j == n-1 || i == 0 || i == n-1 || j == 0 || j == n-1){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();

        }
    }
    static void main() {
        int n = 8;
        invertedHalfPyramid(n);
    }
}
