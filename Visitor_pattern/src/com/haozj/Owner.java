package com.haozj;

public class Owner implements Person {
    @Override
    public void feed(Dog dog) {
        System.out.println("主人喂狗");
    }

    @Override
    public void feed(Cat cat) {
        System.out.println("主人喂猫");
    }
}
