package com.pattrenOnTop.AlllPracticesQuestions.LaksheyDoubt;

import java.util.Scanner;

public class HollowFullPramid {

    static void hollowFullPramid(int n){
        for (int i = 0; i <n ; i++) {
            //space
            for (int j = 0; j <n-i-1; j++) IO.print(" ");

            //Star
            for (int j = 0; j <i+1 ; j++){
             if(i == 0 || i == n-1 || j == 0 || j == n-1 || i == j){
                 IO.print("* ");
             }
             else{
                 IO.print("  ");
             }
            }

            System.out.println();

        }
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of full pyramid: ");
        int n = sc.nextInt();
        hollowFullPramid(n);

    }
}
