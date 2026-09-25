package com.pattrenOnTop.AlllPracticesQuestions.practice;

public class random {

    public static void ran(int n) {
        for (int i = 0; i <n-2 ; i++) {
            for (int j = 0; j <n ; j++) {
                if(i == 0 || i == 1 || j == 2 || j == 3){
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
        int n = 6;
        ran(n);
    }
}
