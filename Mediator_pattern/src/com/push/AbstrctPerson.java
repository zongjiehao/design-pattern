package com.push;

abstract class AbstrctPerson {
    protected String name;
    protected Madiator madiator;

    public AbstrctPerson(String name, Madiator madiator) {
        this.name = name;
        this.madiator = madiator;
    }
    public abstract void receiveMessage(String msg);
}
