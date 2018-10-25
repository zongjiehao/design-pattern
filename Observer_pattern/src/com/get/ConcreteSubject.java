package com.get;

public class ConcreteSubject extends Subject {
    private String subjectState;

    public String getSubjectState() {
        return subjectState;
    }
    public void change(String state){
        this.subjectState =state;
        this.notifyObservers();
    }
}
