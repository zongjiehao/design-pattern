package com.haozj;

public class PrimaryMemberStrategy implements MemberStrategy {
    @Override
    public double calcPrice(double booksPrice) {
        System.out.println("初级会员没有优惠");
        return booksPrice;
    }
}
