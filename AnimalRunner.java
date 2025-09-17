package com.xworkz.abstraction;

public class AnimalRunner {
public static void main(String[] args) {
    Animal a1 = new Dog();
    Animal a2 = new Cat();
    a1.sound();
    a1.eat();
    a2.sound();
    a2.eat();

    System.out.println("---------------");
}
}
