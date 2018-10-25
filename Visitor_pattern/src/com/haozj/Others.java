package com.haozj;

public class Others implements Person {
    @Override
    public void feed(Dog dog) {
        System.out.println("别人喂狗");
    }

    @Override
    public void feed(Cat cat) {
        System.out.println("别人喂猫");
    }
}
