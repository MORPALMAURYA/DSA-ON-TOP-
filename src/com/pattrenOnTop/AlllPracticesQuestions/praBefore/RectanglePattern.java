package com.pattrenOnTop.AlllPracticesQuestions.praBefore;

import java.util.Scanner;

public class RectanglePattern {
    public static void squarePattern(int length , int width){
        for (int i = 0; i <length ; i++) {
            for (int j = 0; j <width ; j++) {
                IO.print("* ");
            }
            IO.print("\n");
        }
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number length ");
        int length = sc.nextInt();
        System.out.println("Enter the width ");
        int width = sc.nextInt();
        squarePattern(length, width);

    }
}
