package com.java_core.java_this_keyword.AllQues.constructor;

class A{

    A(){
        this(100);
        System.out.println("defult called");



    }
    A(int a){
        this("unkwon",200);
        System.out.println(a+" Parameterized called");

    }
    A(String name,int x){
        System.out.print(x);
        System.out.println(name);
    }
}

public class Constructor {


    static void main(String[] args) {
        A a = new A();


    }
}
