package com.pattrenOnTop.AlllPracticesQuestions.Day_1;

import java.util.Scanner;

public class Rectangle {

    static void rectAngle(int width, int height) {
        for (int i = 0; i <width ; i++) {
            for (int j = 0; j <height ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter width:");
        int width = sc.nextInt();
        System.out.print("Enter Length:");
        int length = sc.nextInt();

        rectAngle(width, length);

    }
}
