package com.pattrenOnTop.AlllPracticesQuestions.praBefore;

import java.util.Scanner;

public class HollowHalfPramid {
    static void hollowHalfPramid(int n){
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <i+1 ; j++) {
                if( i == 0 || i == n-1 || j == 0 || j == i){
                    IO.print("* ");
                }
                else{
                    IO.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = input.nextInt();
        hollowHalfPramid(n);
    }
}
