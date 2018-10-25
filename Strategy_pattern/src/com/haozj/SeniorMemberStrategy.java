package com.haozj;

public class SeniorMemberStrategy implements MemberStrategy {
    @Override
    public double calcPrice(double booksPrice) {
        System.out.println("高级会员折扣为20%");
        return booksPrice * 0.8;
    }
}
