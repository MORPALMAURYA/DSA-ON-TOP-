package com.operators.OperatorImportantQues;

public class Swap_With_Out_Thirt_variable {

    public static void main(String[] args) {

        int x = 333;
        int y = 444;

        System.out.println("After swaping two numbers is "+x+" and "+ y);

        x = x +y;
        y = x - y;
        x = x - y;

        System.out.println("After swaping two numbers is : "+x+" and "+ y);

    }
}
