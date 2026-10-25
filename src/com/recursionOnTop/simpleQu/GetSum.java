package com.recursionOnTop.simpleQu;

public class GetSum {
    static int getSum(int n){
        if(n==0){
            return 0;
        }
        int sum = n + getSum(n-1);
        return sum;

    }
    static void main(String[] args) {
        int n = 3;
        int sum = getSum(n);
        System.out.println("sum "+sum);
    }
}
