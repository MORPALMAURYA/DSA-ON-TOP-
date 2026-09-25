package com.pattrenOnTop.AlllPracticesQuestions.Day_1;

public class HalfPyramid {
    static void halfPyramid(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void main() {
        int n = 10;
        halfPyramid(n);
    }
}
