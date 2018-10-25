package com.get;

public class ConcreteObserver implements Observer {
    @Override
    public void update(Subject subject) {
        System.out.println("收到状态的变更："+((ConcreteSubject)subject).getSubjectState());
    }
}
