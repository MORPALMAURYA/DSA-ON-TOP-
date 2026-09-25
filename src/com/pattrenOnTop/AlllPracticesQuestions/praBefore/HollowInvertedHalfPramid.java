package com.pattrenOnTop.AlllPracticesQuestions.praBefore;

import java.util.Scanner;

public class HollowInvertedHalfPramid {
    static void hollowInvertedHalfPramid(int n) {
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n-i ; j++) {
                if(i == 0 || i == n-1 || j == 0 || i+j == n-1){
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
        System.out.println("Enter the number of integers:");
        int n = sc.nextInt();
        hollowInvertedHalfPramid(n);

    }
}
