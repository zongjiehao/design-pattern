package com.haozj;

public class MiddleMemberStrategy implements MemberStrategy {
    @Override
    public double calcPrice(double booksPrice) {
        System.out.println("中级会员折扣为10%");
        return booksPrice * 0.9;
    }
}
