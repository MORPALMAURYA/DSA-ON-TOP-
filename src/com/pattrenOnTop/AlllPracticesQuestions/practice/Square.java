package com.pattrenOnTop.AlllPracticesQuestions.practice;

public class Square {

    public static void square(int n){

        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    static void main() {
        int n = 8;
        square(n);

    }
}
