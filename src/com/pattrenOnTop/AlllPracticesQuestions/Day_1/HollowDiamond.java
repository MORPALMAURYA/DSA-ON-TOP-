package com.pattrenOnTop.AlllPracticesQuestions.Day_1;

public class HollowDiamond {

        static void fullDiamond(int n){
            //FullPyramid
            for (int i = 0; i <n ; i++) {
                //space
                for (int j = 0; j <n-i ; j++) IO.print(" ");
                //star
                for (int j = 0; j <i+1 ; j++) {
                    if(i==0||j==0 || j == n-1 || i == j){
                        IO.print("* ");
                    }
                    else{
                        IO.print("  ");
                    }
                }
                System.out.println();
            }
            //InvertedFullPyramid
            for (int i = 0; i <n ; i++) {
                //space
                for (int j = 0; j <i+1; j++) IO.print(" ");
                //star
                for (int j = 0; j <n-i ; j++) {
                    if(j==0 || i == n-1 || j == n-1 || i+j == n-1){
                        IO.print("* ");
                    }
                    else{
                        IO.print("  ");
                    }
                }

                System.out.println();

            }
        }
        static void main() {
            fullDiamond(5);

        }
    }


