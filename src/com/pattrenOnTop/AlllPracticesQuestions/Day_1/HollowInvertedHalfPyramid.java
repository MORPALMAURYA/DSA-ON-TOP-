package com.pattrenOnTop.AlllPracticesQuestions.Day_1;

public class HollowInvertedHalfPyramid {

    static void hollowInvertedHalfPyramid(int n){
        for(int j=0;j<n;j++){
            for (int i = 0; i <n-j ; i++) {

                if(i == 0 || j == 0 || i+j == n-1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }

    static void main() {
        int n = 10;
        hollowInvertedHalfPyramid(n);

    }
}
