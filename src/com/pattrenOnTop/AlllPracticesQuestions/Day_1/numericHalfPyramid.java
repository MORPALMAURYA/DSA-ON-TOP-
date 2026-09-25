package com.pattrenOnTop.AlllPracticesQuestions.Day_1;

public class numericHalfPyramid {
    static void hollowInvertedHalfPyramid(int n){
        for(int j=0;j<n;j++){
            for (int i = 0; i <j+1 ; i++) {
                System.out.print(i+1+" ");

            }
            System.out.println();
        }
    }

    static void main() {
        int n =10;
        hollowInvertedHalfPyramid(n);
    }
}
