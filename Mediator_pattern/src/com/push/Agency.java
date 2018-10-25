package com.push;

public class Agency implements Madiator {
    private HouseOwner houseOwner;
    private Renter renter;

    public HouseOwner getHouseOwner() {
        return houseOwner;
    }

    public void setHouseOwner(HouseOwner houseOwner) {
        this.houseOwner = houseOwner;
    }

    public Renter getRenter() {
        return renter;
    }

    public void setRenter(Renter renter) {
        this.renter = renter;
    }

    @Override
    public void contact(String content, AbstrctPerson person) {
        if (person == houseOwner){
            renter.receiveMessage(content);
        }else {
            houseOwner.receiveMessage(content);
        }
    }
}
