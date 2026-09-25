package com.pattrenOnTop.AlllPracticesQuestions.Day_1;

import java.util.Scanner;

public class HollowRectangle {
    static void hollowRectangle(int width, int height){
        for (int i = 0; i <width ; i++) {
            for (int j = 0; j <height ; j++) {
                if(i ==0 || i == width-1 || j ==0 || j == height-1){
                    System.out.print("* ");
                }
                else
                   System.out.println("  ");
            }
            System.out.println();

        }
    }

    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter width : ");
        int width = input.nextInt();
        System.out.print("Enter height : ");
        int height = input.nextInt();

        hollowRectangle(width,height);


    }
}
