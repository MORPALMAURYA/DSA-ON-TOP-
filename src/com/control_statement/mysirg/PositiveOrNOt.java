package com.control_statement.mysirg;

public class PositiveOrNOt {

    static void positiveOrNot(int a){
        if(a<0){
            System.out.println("Negative Number");
        }
        else if(a>0){
            System.out.println("Positive Number");
        }
        else{
            System.out.println("Zero Number");
        }

    }

    static void main(String[] args) {
        int n =-98;
        positiveOrNot(n);

    }
}
