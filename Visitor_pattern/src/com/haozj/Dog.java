package com.haozj;

public class Dog implements Animal{
    @Override
    public void accept(Person person) {
        person.feed(this);
        System.out.println("好好吃,汪汪汪！！！");
    }
}
