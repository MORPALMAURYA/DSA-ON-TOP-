package com.java_core.abstractD1;
abstract class Animal {

    // Normal method
     void eat() {
        System.out.println("Animal is eating");
    }

    // Abstract method — no body
    abstract void sound();
}

class Dog extends Animal {
    final void eat(){
        System.out.println("Dog is eating");
    }

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class D1 {
    public static void main(String[] args) {
        Animal d = new Dog();
        d.eat();
        d.sound();
    }
}
