package com.pattrenOnTop.AlllPracticesQuestions.practice;

public class Rectangle {

    public static void rectagnle(int lenght , int width)
    {
        for (int i = 0; i <lenght ; i++) {
            for (int j = 0; j <width; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }

    static void main() {
        int lenght= 7;
        int width= 4;
        rectagnle(lenght, width);

    }
}
