package com.pattrenOnTop.AlllPracticesQuestions.practice;

public class FullPymid {
    static void invertedHalfPyramid(int n) {
        for (int i = 0; i <n ; i++) {

            //space
            for (int j = 0; j < n-i-1; j++) IO.print(" ");

            //star
            for (int j = 0; j <i+1 ; j++) IO.print("* ");

            System.out.println();
        }
    }


    static void main() {
        int n = 8;
        invertedHalfPyramid(n);

    }
}
