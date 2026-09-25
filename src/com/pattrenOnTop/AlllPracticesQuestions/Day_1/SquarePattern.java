package com.pattrenOnTop.AlllPracticesQuestions.Day_1;

import java.util.Scanner;

public class SquarePattern {
    static void squarePattern(int n){
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number N ");
        int n = sc.nextInt();
        squarePattern(n);

    }
}
