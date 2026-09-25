package com.pattrenOnTop.AlllPracticesQuestions.praBefore;

import java.util.Scanner;

public class HellowRectanglePattern {

    static void hellowRectangle(int length,int width){
        for (int i = 0; i < length; i++) {
            for (int j = 0; j <width ; j++) {
                if(i == 0 || i == length-1 || j == 0 || j == width-1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }


    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length ");
        int length = sc.nextInt();
        System.out.println("Enter the width ");
        int width = sc.nextInt();
        hellowRectangle(length,width);
    }
}
