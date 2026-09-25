package com.operators.OperatorImportantQues;

public class Swaping_Without_third_variable_bitwise {
    static void main() {
        int num1 = 333;
        int num2 = 444;

        System.out.println("After swaping two numbers is "+num1+" and "+ num2);

        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;

        System.out.println("After swaping two numbers is "+num1+" and "+ num2);



    }
}
