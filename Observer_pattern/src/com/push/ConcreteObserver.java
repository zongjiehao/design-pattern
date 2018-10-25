package com.push;

public class ConcreteObserver implements Observer {
    @Override
    public void update(String newState) {
        System.out.println("收到状态的变更："+newState);
    }
}
