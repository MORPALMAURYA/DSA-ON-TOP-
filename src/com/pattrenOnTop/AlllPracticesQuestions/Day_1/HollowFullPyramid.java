package com.pattrenOnTop.AlllPracticesQuestions.Day_1;

public class HollowFullPyramid {


    static void hollowFullPyramid(int n) {
        for (int i = 0; i <n; i++) {
            //space
            for (int j = 0; j <n-i ; j++) IO.print(" ");

            //star
            for (int j = 0; j <i+1 ; j++){
                if(i == 0 || i == n-1 ||j == 0 || j == i  ){
                    IO.print("* ");
                }
                else{
                    IO.print("  ");
                }
            }
            System.out.println();
        }
    }

    static void main(String[] args) {
        int n = 10;
        hollowFullPyramid(n);
    }
}
