package com.pattrenOnTop.AlllPracticesQuestions.praBefore;

import java.util.Scanner;

public class HalfPramid {
    public static  void helfPyramid(int n){
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <i+1 ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number N");
        int n = sc.nextInt();
        helfPyramid(n);

    }
}
