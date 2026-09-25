package com.pattrenOnTop.AlllPracticesQuestions.LaksheyDoubt;

import java.util.Scanner;

public class FullPymid {

    public static void fullPymid(int n){
        for (int i = 0; i <n ; i++) {

            // space
            for (int j = 0; j <n-i ; j++) IO.print(" ");

            // star
            for (int j = 0; j < i+1; j++) IO.print("* ");

            System.out.println();
        }
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number N");
        int n = sc.nextInt();
        fullPymid(n);

    }
}
