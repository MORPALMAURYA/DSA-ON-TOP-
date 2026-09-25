package com.pattrenOnTop.AlllPracticesQuestions.practice;

public class hollowSuqare {

    public static void hollowSquare(int n){

        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n; j++) {
                if(i == 0 || i == n-1 || j == 0 || j == n-1){
                    IO.print("* ");
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
        hollowSquare(n);
    }
}
