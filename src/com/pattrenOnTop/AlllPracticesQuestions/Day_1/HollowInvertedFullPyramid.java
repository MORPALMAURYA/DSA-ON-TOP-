package com.pattrenOnTop.AlllPracticesQuestions.Day_1;

public class HollowInvertedFullPyramid {

    static void hollowInvertedFullPyramid(int n){
        for (int i = 0; i <n ; i++) {

            //space
            for (int j = 0; j <i+1 ; j++) IO.print(" ");

            //star
               for (int j = 0; j <n-i ; j++) {
                  if(i == 0 || i == n-1 || j == 0 || j == n-1 || i+j == n-1){
                      IO.print("* ");
                }
                else {
                    IO.print("  ");
                }
            }
            System.out.println();
        }
    }

    static void main() {
        int n =9;
        hollowInvertedFullPyramid(n);

    }
}
