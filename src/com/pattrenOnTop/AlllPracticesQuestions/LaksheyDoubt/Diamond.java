package com.pattrenOnTop.AlllPracticesQuestions.LaksheyDoubt;

import java.util.Scanner;

public class Diamond {

    public static void fullPymid(int n){
        for (int i = 0; i <n ; i++) {

            // space
            for (int j = 0; j <n-i-1 ; j++) IO.print(" ");

            // star
            for (int j = 0; j < i+1; j++) IO.print("* ");

            System.out.println();
        }
    }

    static void invertedFullPyramid(int n){
        for (int i = 0; i <n ; i++) {

            // space
            for (int j = 0; j < i ; j++) IO.print(" ");

            //Star
            for (int j = 0; j < n-i ; j++) IO.print("* ");


            System.out.println();
        }
    }

    static void diamond(int n){
        fullPymid(n);
        invertedFullPyramid(n);
    }


    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of full pyramid:");

        int n = sc.nextInt();
        diamond(n);

    }

}
