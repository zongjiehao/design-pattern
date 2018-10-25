package com.push;

public class Renter extends AbstrctPerson {

    public Renter(String name, Madiator madiator) {
        super(name, madiator);
    }
    public void contact(String msg){
        madiator.contact(msg,this);
    }
    @Override
    public void receiveMessage(String msg) {
        System.out.println("租客:" + name + ",获得信息：" + msg);
    }
}
