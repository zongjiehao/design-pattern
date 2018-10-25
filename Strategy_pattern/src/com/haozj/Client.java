package com.haozj;

import com.haozj.MiddleMemberStrategy;
import com.haozj.Price;
import com.haozj.SeniorMemberStrategy;

public class Client {
    public static void main(String[] args) {
        Price price;
        price = new Price(new MiddleMemberStrategy());
        System.out.println("图书价格为："+price.quote(300));
        price = new Price(new SeniorMemberStrategy());
        System.out.println("图书价格为："+price.quote(300));
    }
}
