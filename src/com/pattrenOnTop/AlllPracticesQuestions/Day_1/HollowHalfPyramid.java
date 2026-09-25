package com.pattrenOnTop.AlllPracticesQuestions.Day_1;

public class HollowHalfPyramid {
    static void halfPyramid(int n){
        for (int i = 0; i < n; i++){
            for (int j = 0; j <i+1; j++){
                if(i == 0 || i == n-1 || j == 0 ||  j == n-1 || j == i){
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
        int n = 10;
        halfPyramid(n);

    }
}
