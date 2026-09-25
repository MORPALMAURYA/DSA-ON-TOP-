package com.pattrenOnTop.AlllPracticesQuestions.Day_1;

public class FullDiamond {

    static void fullDiamond(int n){
        //FullPyramid
        for (int i = 0; i <n ; i++) {
            //space
            for (int j = 0; j <n-i ; j++) IO.print(" ");
            //star
            for (int j = 0; j <i+1 ; j++) IO.print("* ");
            System.out.println();
        }
        //InvertedFullPyramid
        for (int i = 0; i <n ; i++) {
            //space
            for (int j = 0; j <i+1; j++) IO.print(" ");
            //star
            for (int j = 0; j <n-i ; j++) IO.print("* ");

            System.out.println();

        }
    }
    static void main() {
        fullDiamond(5);

    }
}
