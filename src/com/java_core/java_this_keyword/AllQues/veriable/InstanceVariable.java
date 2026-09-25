package com.java_core.java_this_keyword.AllQues.veriable;

class A{
    int age;
    String name;

    A(int age,String name){
        this.age=age;
        this.name=name;
    }
    void show(){
        System.out.println(this.age);
        System.out.println(this.name);
    }
}

public class InstanceVariable {
    static void main(String[] args) {
        A a = new A(21,"morpal");
        a.show();


    }
}
