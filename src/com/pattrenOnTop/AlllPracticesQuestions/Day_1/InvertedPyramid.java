package com.pattrenOnTop.AlllPracticesQuestions.Day_1;

public class InvertedPyramid {
    static void invertedPyramid(int n){
        for (int i = 0; i <n ; i++) {
            //space
            for (int j = 0; j <i+1 ; j++) IO.print(" ");

            // star
            for (int j = 0; j <n-i ; j++)  IO.print("* ");

            System.out.println();
        }
    }

    static void main() {
        int n = 10;
        invertedPyramid(n);

    }
}
