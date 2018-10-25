package com.push;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    //保存注册的观察者对象
    private List<Observer> observers = new ArrayList<>();
    //注册观察者对象
    public void attach(Observer observer){
        observers.add(observer);
    }
    //删除注册者对象
    public void remove(Observer observer){
        observers.remove(observer);
    }
    //通知所有观察者状态的变更
    public void notifyObservers(String newState){
        for (Observer observer : observers) {
            observer.update(newState);
        }
    }
}
