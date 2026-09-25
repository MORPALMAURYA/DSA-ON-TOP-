package com.java_core.java_this_keyword.AllQues.mothods;
class A{
    A(){
        show2();
        System.out.println("defult called");
    }

    void show(){
        System.out.println("show called");
    }

    void show2(){
        this.show();
//        show2();  this keyword opstional hai
        System.out.println("show2 called");
    }

}
public class Methods {
    static void main(String[] args) {
        A a = new A();


    }
}
