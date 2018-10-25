package com.haozj;

public class Client {
    public static void main(String[] args) {
        Home home = new Home();
        home.add(new Dog());
        home.add(new Cat());
        home.action(new Owner());
        home.action(new Others());

    }
}
