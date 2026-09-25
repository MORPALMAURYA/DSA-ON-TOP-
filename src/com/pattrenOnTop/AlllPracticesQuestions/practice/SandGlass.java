package com.pattrenOnTop.AlllPracticesQuestions.practice;

public class SandGlass {


    public static void sandGlass(int n) {


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || i + j == n - 1 || i == j) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }


    static void main() {
        int n = 50;
        sandGlass(n);
    }
}
