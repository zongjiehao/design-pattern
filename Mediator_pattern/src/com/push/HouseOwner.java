package com.push;

public class HouseOwner extends AbstrctPerson {
    public HouseOwner(String name, Madiator madiator) {
        super(name, madiator);
    }

    @Override
    public void receiveMessage(String msg) {
        System.out.println("房东:" + name + ",获得信息：" + msg);
    }
    public void contact(String msg){
        madiator.contact(msg,this);
    }
}
