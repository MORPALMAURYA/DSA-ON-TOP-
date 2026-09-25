package com.pattrenOnTop.AlllPracticesQuestions.praBefore;

import java.util.Scanner;

public class Square {
    public static void squarePattern(int n){
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                IO.print("* ");
            }
            IO.println();
        }
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        squarePattern(n);
    }
}
