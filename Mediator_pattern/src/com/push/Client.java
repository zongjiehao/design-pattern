package com.push;

public class Client {
    public static void main(String[] args) {
        Agency agency = new Agency();
        HouseOwner houseOwner = new HouseOwner("小东",agency);
        Renter renter = new Renter("小租",agency);
        agency.setHouseOwner(houseOwner);
        agency.setRenter(renter);
        renter.contact("房东,你好还有房子吗？");
        houseOwner.contact("还有,你需要租吗？");
    }
}
