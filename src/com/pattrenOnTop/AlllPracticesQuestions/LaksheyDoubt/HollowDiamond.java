package com.pattrenOnTop.AlllPracticesQuestions.LaksheyDoubt;

import java.util.Scanner;

public class HollowDiamond {

    static void hollowFullPramid(int n){
        for (int i = 0; i <n ; i++) {
            //space
            for (int j = 0; j <n-i-1; j++) IO.print(" ");

            //Star
            for (int j = 0; j <i+1 ; j++){
                if(i == 0  || j == 0 || i == j){
                    IO.print("* ");
                }
                else{
                    IO.print("  ");
                }
            }

            System.out.println();

        }
    }

    static void hollowinvertedFullPramid(int n){
        for (int i = 0; i <n ; i++) {
            //space
            for (int j = 0; j <i; j++) IO.print(" ");

            //Star
            for (int j = 0; j <n-i; j++){
                if( j == 0  || j+i == n-1){
                    IO.print("* ");
                }
                else{
                    IO.print("  ");
                }
            }

            System.out.println();

        }
    }

   static void  hollowDiamond(int n){
        hollowFullPramid(n);
        hollowinvertedFullPramid(n);
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        hollowDiamond(n);
    }

}
